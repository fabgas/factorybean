package org.alma.beanfactory;

import java.util.Set;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanFactoryApp {

	public static void main(String[] args) {
		ClassPathScanning provider = new ClassPathScanning();
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		BaseService base = (BaseService)  ctx.getBean(BaseService.class);
		
		base.hello();
	}

}
