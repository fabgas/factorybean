package org.alma.beanfactory;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.Set;

import org.alma.beanfactory.annotation.Pizza;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.ResolvableType;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.util.StringUtils;

/**
 * Création et ajout des beans
 * @author Fabrice
 *
 */
public class PizzaBeanCreationDelegate {
	Class factoryClass = PizzaFactory.class;
	Class annoClass  = Pizza.class;
	public void delegate(BeanDefinitionRegistry registry) {
		Set<BeanDefinition> definitions = extractAnnotations();
		
		if (definitions != null) {
		 for (Iterator iterator = definitions.iterator(); iterator.hasNext();) {
			BeanDefinition beanDefinition = (BeanDefinition) iterator.next();
			String classPizza = beanDefinition.getBeanClassName();
			registerBean(registry, classPizza);
		 }
		}
	}

	private void registerBean(BeanDefinitionRegistry registry, String classPizza) {
		try {
			Class<?> clazz = Class.forName(classPizza);
			ConstructorArgumentValues cav = new ConstructorArgumentValues();
			cav.addGenericArgumentValue(clazz);
			Annotation pizzaAnotation = getAnnotation(clazz);
			ResolvableType resolvableType = ResolvableType.forClass(factoryClass);
			RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(factoryClass, cav, null);
			rootBeanDefinition.setTargetType(resolvableType);
			rootBeanDefinition.setBeanClass(factoryClass);
			rootBeanDefinition.setDescription("desc");
			registry.registerBeanDefinition (clazz.getCanonicalName() + "Factory", rootBeanDefinition);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private Set<BeanDefinition> extractAnnotations() {
		ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(false) {
		    @Override
		    protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
		        return true;
		    }
		};
		scanner.addIncludeFilter(new AnnotationTypeFilter(annoClass));
		Set<BeanDefinition> definitions = scanner.findCandidateComponents("org.alma.beanfactory");
		return definitions;
	}
	
	private void getBeanRegisterName(Class<?> clazz) {
		Annotation pizzaAnotation = getAnnotation(clazz);
		
	}
	private Annotation getAnnotation(Class<?> clazz) {
		Annotation[] annotation = clazz.getAnnotations();
		if (annotation != null) {
			for (int i = 0; i < annotation.length; i++) {
				Annotation anno = annotation[i];
				if (anno.getClass().equals(anno.getClass())) {
					return anno;
				}
			}
		}
		throw new RuntimeException("Impossible de trouver l'annotation pizza alors que l'on avait filtré les classes. impossibles");
	}
	
	
}
