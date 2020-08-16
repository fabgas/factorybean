package org.alma.beanfactory;

import java.lang.reflect.Proxy;


import org.alma.beanfactory.pizza.PizzaHandler;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.AbstractFactoryBean;

public class PizzaFactory extends AbstractFactoryBean {
	public Class classForFactory;
	
	public PizzaFactory(Class classForFactory) {
		super();
		this.classForFactory = classForFactory;
	}

	public Class getObjectType() {
		return classForFactory;
	}

	@Override
	protected Object createInstance() throws Exception {
	
		Object instance = Proxy.newProxyInstance(
				classForFactory.getClassLoader(),
				new Class[] {classForFactory},
				new PizzaHandler()
				);	
		return instance;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) {
		
		super.setBeanFactory(beanFactory);
	}

}
