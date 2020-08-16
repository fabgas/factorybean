package org.alma.beanfactory;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.Set;

import org.alma.beanfactory.annotation.Pizza;
import org.alma.beanfactory.pizza.CheesePizza;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.ResolvableType;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;

public class SpecificBeanRegistration implements ImportBeanDefinitionRegistrar  {

	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry,
			BeanNameGenerator importBeanNameGenerator) {
		System.err.println(CheesePizza.class.getName());
		ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(false) {
		    @Override
		    protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
		        return true;
		    }
		};
		scanner.addIncludeFilter(new AnnotationTypeFilter(Pizza.class));
		Set<BeanDefinition> definitions = scanner.findCandidateComponents("org.alma.beanfactory");
		if (definitions != null) {
		 for (Iterator iterator = definitions.iterator(); iterator.hasNext();) {
			BeanDefinition beanDefinition = (BeanDefinition) iterator.next();
			
			String classPizza = beanDefinition.getBeanClassName();
			try {
				Class<?> clazz = Class.forName(classPizza);
			ConstructorArgumentValues cav = new ConstructorArgumentValues();
			cav.addGenericArgumentValue(clazz);
			Annotation[] annotation = clazz.getAnnotations();
			String value = ((Pizza)annotation[0]).value();
          	ResolvableType resolvableType = ResolvableType.forClass(PizzaFactory.class);
          	RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(PizzaFactory.class, cav, null);
          	rootBeanDefinition.setTargetType(resolvableType);
          	rootBeanDefinition.setBeanClass(PizzaFactory.class);
          	rootBeanDefinition.setDescription("desc");
          	registry.registerBeanDefinition (clazz.getCanonicalName() + "Factory", rootBeanDefinition);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		}
	}

	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		System.err.println("totoa");
	}

}
