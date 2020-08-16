package org.alma.beanfactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"org.alma.beanfactory"})
@Import(MyBeanRegistration.class)
public class SpringConfig {
	@Bean
	ServiceImpl serviceImpl() {
		return new ServiceImpl();
	}

	
}
