package org.alma.beanfactory;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;

public class ClassPathScanning extends ClassPathScanningCandidateComponentProvider {

	@Override
	protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
		// TODO Auto-generated method stub
		return super.isCandidateComponent(beanDefinition);
	}

}
