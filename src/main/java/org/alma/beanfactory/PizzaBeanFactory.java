package org.alma.beanfactory;

import java.beans.PropertyDescriptor;
import java.beans.PropertyEditor;
import java.io.ObjectStreamException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.security.AccessControlContext;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.TypeConverter;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.CannotLoadBeanClassException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanExpressionResolver;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.DependencyDescriptor;
import org.springframework.beans.factory.config.NamedBeanHolder;
import org.springframework.beans.factory.config.Scope;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.AutowireCandidateResolver;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.InstantiationStrategy;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.support.SecurityContextProvider;
import org.springframework.core.ParameterNameDiscoverer;
import org.springframework.core.ResolvableType;
import org.springframework.core.convert.ConversionService;
import org.springframework.util.StringValueResolver;

public class PizzaBeanFactory extends DefaultListableBeanFactory {

	@Override
	public void setSerializationId(String serializationId) {
		// TODO Auto-generated method stub
		super.setSerializationId(serializationId);
	}

	@Override
	public String getSerializationId() {
		// TODO Auto-generated method stub
		return super.getSerializationId();
	}

	@Override
	public void setAllowBeanDefinitionOverriding(boolean allowBeanDefinitionOverriding) {
		// TODO Auto-generated method stub
		super.setAllowBeanDefinitionOverriding(allowBeanDefinitionOverriding);
	}

	@Override
	public boolean isAllowBeanDefinitionOverriding() {
		// TODO Auto-generated method stub
		return super.isAllowBeanDefinitionOverriding();
	}

	@Override
	public void setAllowEagerClassLoading(boolean allowEagerClassLoading) {
		// TODO Auto-generated method stub
		super.setAllowEagerClassLoading(allowEagerClassLoading);
	}

	@Override
	public boolean isAllowEagerClassLoading() {
		// TODO Auto-generated method stub
		return super.isAllowEagerClassLoading();
	}

	@Override
	public void setDependencyComparator(Comparator<Object> dependencyComparator) {
		// TODO Auto-generated method stub
		super.setDependencyComparator(dependencyComparator);
	}

	@Override
	public Comparator<Object> getDependencyComparator() {
		// TODO Auto-generated method stub
		return super.getDependencyComparator();
	}

	@Override
	public void setAutowireCandidateResolver(AutowireCandidateResolver autowireCandidateResolver) {
		// TODO Auto-generated method stub
		super.setAutowireCandidateResolver(autowireCandidateResolver);
	}

	@Override
	public AutowireCandidateResolver getAutowireCandidateResolver() {
		// TODO Auto-generated method stub
		return super.getAutowireCandidateResolver();
	}

	@Override
	public void copyConfigurationFrom(ConfigurableBeanFactory otherFactory) {
		// TODO Auto-generated method stub
		super.copyConfigurationFrom(otherFactory);
	}

	@Override
	public <T> T getBean(Class<T> requiredType) throws BeansException {
		// TODO Auto-generated method stub
		return super.getBean(requiredType);
	}

	@Override
	public <T> T getBean(Class<T> requiredType, Object... args) throws BeansException {
		// TODO Auto-generated method stub
		return super.getBean(requiredType, args);
	}

	@Override
	public <T> ObjectProvider<T> getBeanProvider(Class<T> requiredType) throws BeansException {
		// TODO Auto-generated method stub
		return super.getBeanProvider(requiredType);
	}

	@Override
	public <T> ObjectProvider<T> getBeanProvider(ResolvableType requiredType) {
		// TODO Auto-generated method stub
		return super.getBeanProvider(requiredType);
	}

	@Override
	public boolean containsBeanDefinition(String beanName) {
		// TODO Auto-generated method stub
		return super.containsBeanDefinition(beanName);
	}

	@Override
	public int getBeanDefinitionCount() {
		// TODO Auto-generated method stub
		return super.getBeanDefinitionCount();
	}

	@Override
	public String[] getBeanDefinitionNames() {
		// TODO Auto-generated method stub
		return super.getBeanDefinitionNames();
	}

	@Override
	public String[] getBeanNamesForType(ResolvableType type) {
		// TODO Auto-generated method stub
		return super.getBeanNamesForType(type);
	}

	@Override
	public String[] getBeanNamesForType(ResolvableType type, boolean includeNonSingletons, boolean allowEagerInit) {
		// TODO Auto-generated method stub
		return super.getBeanNamesForType(type, includeNonSingletons, allowEagerInit);
	}

	@Override
	public String[] getBeanNamesForType(Class<?> type) {
		// TODO Auto-generated method stub
		return super.getBeanNamesForType(type);
	}

	@Override
	public String[] getBeanNamesForType(Class<?> type, boolean includeNonSingletons, boolean allowEagerInit) {
		// TODO Auto-generated method stub
		return super.getBeanNamesForType(type, includeNonSingletons, allowEagerInit);
	}

	@Override
	public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
		// TODO Auto-generated method stub
		return super.getBeansOfType(type);
	}

	@Override
	public <T> Map<String, T> getBeansOfType(Class<T> type, boolean includeNonSingletons, boolean allowEagerInit)
			throws BeansException {
		// TODO Auto-generated method stub
		return super.getBeansOfType(type, includeNonSingletons, allowEagerInit);
	}

	@Override
	public String[] getBeanNamesForAnnotation(Class<? extends Annotation> annotationType) {
		// TODO Auto-generated method stub
		return super.getBeanNamesForAnnotation(annotationType);
	}

	@Override
	public Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> annotationType) {
		// TODO Auto-generated method stub
		return super.getBeansWithAnnotation(annotationType);
	}

	@Override
	public <A extends Annotation> A findAnnotationOnBean(String beanName, Class<A> annotationType)
			throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return super.findAnnotationOnBean(beanName, annotationType);
	}

	@Override
	public void registerResolvableDependency(Class<?> dependencyType, Object autowiredValue) {
		// TODO Auto-generated method stub
		super.registerResolvableDependency(dependencyType, autowiredValue);
	}

	@Override
	public boolean isAutowireCandidate(String beanName, DependencyDescriptor descriptor)
			throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return super.isAutowireCandidate(beanName, descriptor);
	}

	@Override
	protected boolean isAutowireCandidate(String beanName, DependencyDescriptor descriptor,
			AutowireCandidateResolver resolver) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return super.isAutowireCandidate(beanName, descriptor, resolver);
	}

	@Override
	protected boolean isAutowireCandidate(String beanName, RootBeanDefinition mbd, DependencyDescriptor descriptor,
			AutowireCandidateResolver resolver) {
		// TODO Auto-generated method stub
		return super.isAutowireCandidate(beanName, mbd, descriptor, resolver);
	}

	@Override
	public BeanDefinition getBeanDefinition(String beanName) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return super.getBeanDefinition(beanName);
	}

	@Override
	public Iterator<String> getBeanNamesIterator() {
		// TODO Auto-generated method stub
		return super.getBeanNamesIterator();
	}

	@Override
	protected void clearMergedBeanDefinition(String beanName) {
		// TODO Auto-generated method stub
		super.clearMergedBeanDefinition(beanName);
	}

	@Override
	public void clearMetadataCache() {
		// TODO Auto-generated method stub
		super.clearMetadataCache();
	}

	@Override
	public void freezeConfiguration() {
		// TODO Auto-generated method stub
		super.freezeConfiguration();
	}

	@Override
	public boolean isConfigurationFrozen() {
		// TODO Auto-generated method stub
		return super.isConfigurationFrozen();
	}

	@Override
	protected boolean isBeanEligibleForMetadataCaching(String beanName) {
		// TODO Auto-generated method stub
		return super.isBeanEligibleForMetadataCaching(beanName);
	}

	@Override
	public void preInstantiateSingletons() throws BeansException {
		// TODO Auto-generated method stub
		super.preInstantiateSingletons();
	}

	@Override
	public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition)
			throws BeanDefinitionStoreException {
		// TODO Auto-generated method stub
		super.registerBeanDefinition(beanName, beanDefinition);
	}

	@Override
	public void removeBeanDefinition(String beanName) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		super.removeBeanDefinition(beanName);
	}

	@Override
	protected void resetBeanDefinition(String beanName) {
		// TODO Auto-generated method stub
		super.resetBeanDefinition(beanName);
	}

	@Override
	protected boolean allowAliasOverriding() {
		// TODO Auto-generated method stub
		return super.allowAliasOverriding();
	}

	@Override
	public void registerSingleton(String beanName, Object singletonObject) throws IllegalStateException {
		// TODO Auto-generated method stub
		super.registerSingleton(beanName, singletonObject);
	}

	@Override
	public void destroySingletons() {
		// TODO Auto-generated method stub
		super.destroySingletons();
	}

	@Override
	public void destroySingleton(String beanName) {
		// TODO Auto-generated method stub
		super.destroySingleton(beanName);
	}

	@Override
	public <T> NamedBeanHolder<T> resolveNamedBean(Class<T> requiredType) throws BeansException {
		// TODO Auto-generated method stub
		return super.resolveNamedBean(requiredType);
	}

	@Override
	public Object resolveDependency(DependencyDescriptor descriptor, String requestingBeanName,
			Set<String> autowiredBeanNames, TypeConverter typeConverter) throws BeansException {
		// TODO Auto-generated method stub
		return super.resolveDependency(descriptor, requestingBeanName, autowiredBeanNames, typeConverter);
	}

	@Override
	public Object doResolveDependency(DependencyDescriptor descriptor, String beanName, Set<String> autowiredBeanNames,
			TypeConverter typeConverter) throws BeansException {
		// TODO Auto-generated method stub
		return super.doResolveDependency(descriptor, beanName, autowiredBeanNames, typeConverter);
	}

	@Override
	protected Map<String, Object> findAutowireCandidates(String beanName, Class<?> requiredType,
			DependencyDescriptor descriptor) {
		// TODO Auto-generated method stub
		return super.findAutowireCandidates(beanName, requiredType, descriptor);
	}

	@Override
	protected String determineAutowireCandidate(Map<String, Object> candidates, DependencyDescriptor descriptor) {
		// TODO Auto-generated method stub
		return super.determineAutowireCandidate(candidates, descriptor);
	}

	@Override
	protected String determinePrimaryCandidate(Map<String, Object> candidates, Class<?> requiredType) {
		// TODO Auto-generated method stub
		return super.determinePrimaryCandidate(candidates, requiredType);
	}

	@Override
	protected String determineHighestPriorityCandidate(Map<String, Object> candidates, Class<?> requiredType) {
		// TODO Auto-generated method stub
		return super.determineHighestPriorityCandidate(candidates, requiredType);
	}

	@Override
	protected boolean isPrimary(String beanName, Object beanInstance) {
		// TODO Auto-generated method stub
		return super.isPrimary(beanName, beanInstance);
	}

	@Override
	protected Integer getPriority(Object beanInstance) {
		// TODO Auto-generated method stub
		return super.getPriority(beanInstance);
	}

	@Override
	protected boolean matchesBeanName(String beanName, String candidateName) {
		// TODO Auto-generated method stub
		return super.matchesBeanName(beanName, candidateName);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected Object writeReplace() throws ObjectStreamException {
		// TODO Auto-generated method stub
		return super.writeReplace();
	}

	@Override
	public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
		// TODO Auto-generated method stub
		super.setInstantiationStrategy(instantiationStrategy);
	}

	@Override
	protected InstantiationStrategy getInstantiationStrategy() {
		// TODO Auto-generated method stub
		return super.getInstantiationStrategy();
	}

	@Override
	public void setParameterNameDiscoverer(ParameterNameDiscoverer parameterNameDiscoverer) {
		// TODO Auto-generated method stub
		super.setParameterNameDiscoverer(parameterNameDiscoverer);
	}

	@Override
	protected ParameterNameDiscoverer getParameterNameDiscoverer() {
		// TODO Auto-generated method stub
		return super.getParameterNameDiscoverer();
	}

	@Override
	public void setAllowCircularReferences(boolean allowCircularReferences) {
		// TODO Auto-generated method stub
		super.setAllowCircularReferences(allowCircularReferences);
	}

	@Override
	public void setAllowRawInjectionDespiteWrapping(boolean allowRawInjectionDespiteWrapping) {
		// TODO Auto-generated method stub
		super.setAllowRawInjectionDespiteWrapping(allowRawInjectionDespiteWrapping);
	}

	@Override
	public void ignoreDependencyType(Class<?> type) {
		// TODO Auto-generated method stub
		super.ignoreDependencyType(type);
	}

	@Override
	public void ignoreDependencyInterface(Class<?> ifc) {
		// TODO Auto-generated method stub
		super.ignoreDependencyInterface(ifc);
	}

	@Override
	public <T> T createBean(Class<T> beanClass) throws BeansException {
		// TODO Auto-generated method stub
		return super.createBean(beanClass);
	}

	@Override
	public void autowireBean(Object existingBean) {
		// TODO Auto-generated method stub
		super.autowireBean(existingBean);
	}

	@Override
	public Object configureBean(Object existingBean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return super.configureBean(existingBean, beanName);
	}

	@Override
	public Object createBean(Class<?> beanClass, int autowireMode, boolean dependencyCheck) throws BeansException {
		// TODO Auto-generated method stub
		return super.createBean(beanClass, autowireMode, dependencyCheck);
	}

	@Override
	public Object autowire(Class<?> beanClass, int autowireMode, boolean dependencyCheck) throws BeansException {
		// TODO Auto-generated method stub
		return super.autowire(beanClass, autowireMode, dependencyCheck);
	}

	@Override
	public void autowireBeanProperties(Object existingBean, int autowireMode, boolean dependencyCheck)
			throws BeansException {
		// TODO Auto-generated method stub
		super.autowireBeanProperties(existingBean, autowireMode, dependencyCheck);
	}

	@Override
	public void applyBeanPropertyValues(Object existingBean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		super.applyBeanPropertyValues(existingBean, beanName);
	}

	@Override
	public Object initializeBean(Object existingBean, String beanName) {
		// TODO Auto-generated method stub
		return super.initializeBean(existingBean, beanName);
	}

	@Override
	public Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		return super.applyBeanPostProcessorsBeforeInitialization(existingBean, beanName);
	}

	@Override
	public Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		return super.applyBeanPostProcessorsAfterInitialization(existingBean, beanName);
	}

	@Override
	public void destroyBean(Object existingBean) {
		// TODO Auto-generated method stub
		super.destroyBean(existingBean);
	}

	@Override
	public Object resolveBeanByName(String name, DependencyDescriptor descriptor) {
		// TODO Auto-generated method stub
		return super.resolveBeanByName(name, descriptor);
	}

	@Override
	public Object resolveDependency(DependencyDescriptor descriptor, String requestingBeanName) throws BeansException {
		// TODO Auto-generated method stub
		return super.resolveDependency(descriptor, requestingBeanName);
	}

	@Override
	protected Object createBean(String beanName, RootBeanDefinition mbd, Object[] args) throws BeanCreationException {
		// TODO Auto-generated method stub
		return super.createBean(beanName, mbd, args);
	}

	@Override
	protected Object doCreateBean(String beanName, RootBeanDefinition mbd, Object[] args) throws BeanCreationException {
		// TODO Auto-generated method stub
		return super.doCreateBean(beanName, mbd, args);
	}

	@Override
	protected Class<?> predictBeanType(String beanName, RootBeanDefinition mbd, Class<?>... typesToMatch) {
		// TODO Auto-generated method stub
		return super.predictBeanType(beanName, mbd, typesToMatch);
	}

	@Override
	protected Class<?> determineTargetType(String beanName, RootBeanDefinition mbd, Class<?>... typesToMatch) {
		// TODO Auto-generated method stub
		return super.determineTargetType(beanName, mbd, typesToMatch);
	}

	@Override
	protected Class<?> getTypeForFactoryMethod(String beanName, RootBeanDefinition mbd, Class<?>... typesToMatch) {
		// TODO Auto-generated method stub
		return super.getTypeForFactoryMethod(beanName, mbd, typesToMatch);
	}

	@Override
	protected ResolvableType getTypeForFactoryBean(String beanName, RootBeanDefinition mbd, boolean allowInit) {
		// TODO Auto-generated method stub
		return super.getTypeForFactoryBean(beanName, mbd, allowInit);
	}

	@Override
	protected Class<?> getTypeForFactoryBean(String beanName, RootBeanDefinition mbd) {
		// TODO Auto-generated method stub
		return super.getTypeForFactoryBean(beanName, mbd);
	}

	@Override
	protected Object getEarlyBeanReference(String beanName, RootBeanDefinition mbd, Object bean) {
		// TODO Auto-generated method stub
		return super.getEarlyBeanReference(beanName, mbd, bean);
	}

	@Override
	protected void applyMergedBeanDefinitionPostProcessors(RootBeanDefinition mbd, Class<?> beanType, String beanName) {
		// TODO Auto-generated method stub
		super.applyMergedBeanDefinitionPostProcessors(mbd, beanType, beanName);
	}

	@Override
	protected Object resolveBeforeInstantiation(String beanName, RootBeanDefinition mbd) {
		// TODO Auto-generated method stub
		return super.resolveBeforeInstantiation(beanName, mbd);
	}

	@Override
	protected Object applyBeanPostProcessorsBeforeInstantiation(Class<?> beanClass, String beanName) {
		// TODO Auto-generated method stub
		return super.applyBeanPostProcessorsBeforeInstantiation(beanClass, beanName);
	}

	@Override
	protected BeanWrapper createBeanInstance(String beanName, RootBeanDefinition mbd, Object[] args) {
		// TODO Auto-generated method stub
		return super.createBeanInstance(beanName, mbd, args);
	}

	@Override
	protected BeanWrapper obtainFromSupplier(Supplier<?> instanceSupplier, String beanName) {
		// TODO Auto-generated method stub
		return super.obtainFromSupplier(instanceSupplier, beanName);
	}

	@Override
	protected Object getObjectForBeanInstance(Object beanInstance, String name, String beanName,
			RootBeanDefinition mbd) {
		// TODO Auto-generated method stub
		return super.getObjectForBeanInstance(beanInstance, name, beanName, mbd);
	}

	@Override
	protected Constructor<?>[] determineConstructorsFromBeanPostProcessors(Class<?> beanClass, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		return super.determineConstructorsFromBeanPostProcessors(beanClass, beanName);
	}

	@Override
	protected BeanWrapper instantiateBean(String beanName, RootBeanDefinition mbd) {
		// TODO Auto-generated method stub
		return super.instantiateBean(beanName, mbd);
	}

	@Override
	protected BeanWrapper instantiateUsingFactoryMethod(String beanName, RootBeanDefinition mbd,
			Object[] explicitArgs) {
		// TODO Auto-generated method stub
		return super.instantiateUsingFactoryMethod(beanName, mbd, explicitArgs);
	}

	@Override
	protected BeanWrapper autowireConstructor(String beanName, RootBeanDefinition mbd, Constructor<?>[] ctors,
			Object[] explicitArgs) {
		// TODO Auto-generated method stub
		return super.autowireConstructor(beanName, mbd, ctors, explicitArgs);
	}

	@Override
	protected void populateBean(String beanName, RootBeanDefinition mbd, BeanWrapper bw) {
		// TODO Auto-generated method stub
		super.populateBean(beanName, mbd, bw);
	}

	@Override
	protected void autowireByName(String beanName, AbstractBeanDefinition mbd, BeanWrapper bw,
			MutablePropertyValues pvs) {
		// TODO Auto-generated method stub
		super.autowireByName(beanName, mbd, bw, pvs);
	}

	@Override
	protected void autowireByType(String beanName, AbstractBeanDefinition mbd, BeanWrapper bw,
			MutablePropertyValues pvs) {
		// TODO Auto-generated method stub
		super.autowireByType(beanName, mbd, bw, pvs);
	}

	@Override
	protected String[] unsatisfiedNonSimpleProperties(AbstractBeanDefinition mbd, BeanWrapper bw) {
		// TODO Auto-generated method stub
		return super.unsatisfiedNonSimpleProperties(mbd, bw);
	}

	@Override
	protected PropertyDescriptor[] filterPropertyDescriptorsForDependencyCheck(BeanWrapper bw, boolean cache) {
		// TODO Auto-generated method stub
		return super.filterPropertyDescriptorsForDependencyCheck(bw, cache);
	}

	@Override
	protected PropertyDescriptor[] filterPropertyDescriptorsForDependencyCheck(BeanWrapper bw) {
		// TODO Auto-generated method stub
		return super.filterPropertyDescriptorsForDependencyCheck(bw);
	}

	@Override
	protected boolean isExcludedFromDependencyCheck(PropertyDescriptor pd) {
		// TODO Auto-generated method stub
		return super.isExcludedFromDependencyCheck(pd);
	}

	@Override
	protected void checkDependencies(String beanName, AbstractBeanDefinition mbd, PropertyDescriptor[] pds,
			PropertyValues pvs) throws UnsatisfiedDependencyException {
		// TODO Auto-generated method stub
		super.checkDependencies(beanName, mbd, pds, pvs);
	}

	@Override
	protected void applyPropertyValues(String beanName, BeanDefinition mbd, BeanWrapper bw, PropertyValues pvs) {
		// TODO Auto-generated method stub
		super.applyPropertyValues(beanName, mbd, bw, pvs);
	}

	@Override
	protected Object initializeBean(String beanName, Object bean, RootBeanDefinition mbd) {
		// TODO Auto-generated method stub
		return super.initializeBean(beanName, bean, mbd);
	}

	@Override
	protected void invokeInitMethods(String beanName, Object bean, RootBeanDefinition mbd) throws Throwable {
		// TODO Auto-generated method stub
		super.invokeInitMethods(beanName, bean, mbd);
	}

	@Override
	protected void invokeCustomInitMethod(String beanName, Object bean, RootBeanDefinition mbd) throws Throwable {
		// TODO Auto-generated method stub
		super.invokeCustomInitMethod(beanName, bean, mbd);
	}

	@Override
	protected Object postProcessObjectFromFactoryBean(Object object, String beanName) {
		// TODO Auto-generated method stub
		return super.postProcessObjectFromFactoryBean(object, beanName);
	}

	@Override
	protected void removeSingleton(String beanName) {
		// TODO Auto-generated method stub
		super.removeSingleton(beanName);
	}

	@Override
	protected void clearSingletonCache() {
		// TODO Auto-generated method stub
		super.clearSingletonCache();
	}

	@Override
	public Object getBean(String name) throws BeansException {
		// TODO Auto-generated method stub
		return super.getBean(name);
	}

	@Override
	public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
		// TODO Auto-generated method stub
		return super.getBean(name, requiredType);
	}

	@Override
	public Object getBean(String name, Object... args) throws BeansException {
		// TODO Auto-generated method stub
		return super.getBean(name, args);
	}

	@Override
	public <T> T getBean(String name, Class<T> requiredType, Object... args) throws BeansException {
		// TODO Auto-generated method stub
		return super.getBean(name, requiredType, args);
	}

	@Override
	protected <T> T doGetBean(String name, Class<T> requiredType, Object[] args, boolean typeCheckOnly)
			throws BeansException {
		// TODO Auto-generated method stub
		return super.doGetBean(name, requiredType, args, typeCheckOnly);
	}

	@Override
	public boolean containsBean(String name) {
		// TODO Auto-generated method stub
		return super.containsBean(name);
	}

	@Override
	public boolean isSingleton(String name) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return super.isSingleton(name);
	}

	@Override
	public boolean isPrototype(String name) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return super.isPrototype(name);
	}

	@Override
	public boolean isTypeMatch(String name, ResolvableType typeToMatch) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return super.isTypeMatch(name, typeToMatch);
	}

	@Override
	protected boolean isTypeMatch(String name, ResolvableType typeToMatch, boolean allowFactoryBeanInit)
			throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return super.isTypeMatch(name, typeToMatch, allowFactoryBeanInit);
	}

	@Override
	public boolean isTypeMatch(String name, Class<?> typeToMatch) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return super.isTypeMatch(name, typeToMatch);
	}

	@Override
	public Class<?> getType(String name) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return super.getType(name);
	}

	@Override
	public Class<?> getType(String name, boolean allowFactoryBeanInit) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return super.getType(name, allowFactoryBeanInit);
	}

	@Override
	public String[] getAliases(String name) {
		// TODO Auto-generated method stub
		return super.getAliases(name);
	}

	@Override
	public org.springframework.beans.factory.BeanFactory getParentBeanFactory() {
		// TODO Auto-generated method stub
		return super.getParentBeanFactory();
	}

	@Override
	public boolean containsLocalBean(String name) {
		// TODO Auto-generated method stub
		return super.containsLocalBean(name);
	}

	@Override
	public void setParentBeanFactory(org.springframework.beans.factory.BeanFactory parentBeanFactory) {
		// TODO Auto-generated method stub
		super.setParentBeanFactory(parentBeanFactory);
	}

	@Override
	public void setBeanClassLoader(ClassLoader beanClassLoader) {
		// TODO Auto-generated method stub
		super.setBeanClassLoader(beanClassLoader);
	}

	@Override
	public ClassLoader getBeanClassLoader() {
		// TODO Auto-generated method stub
		return super.getBeanClassLoader();
	}

	@Override
	public void setTempClassLoader(ClassLoader tempClassLoader) {
		// TODO Auto-generated method stub
		super.setTempClassLoader(tempClassLoader);
	}

	@Override
	public ClassLoader getTempClassLoader() {
		// TODO Auto-generated method stub
		return super.getTempClassLoader();
	}

	@Override
	public void setCacheBeanMetadata(boolean cacheBeanMetadata) {
		// TODO Auto-generated method stub
		super.setCacheBeanMetadata(cacheBeanMetadata);
	}

	@Override
	public boolean isCacheBeanMetadata() {
		// TODO Auto-generated method stub
		return super.isCacheBeanMetadata();
	}

	@Override
	public void setBeanExpressionResolver(BeanExpressionResolver resolver) {
		// TODO Auto-generated method stub
		super.setBeanExpressionResolver(resolver);
	}

	@Override
	public BeanExpressionResolver getBeanExpressionResolver() {
		// TODO Auto-generated method stub
		return super.getBeanExpressionResolver();
	}

	@Override
	public void setConversionService(ConversionService conversionService) {
		// TODO Auto-generated method stub
		super.setConversionService(conversionService);
	}

	@Override
	public ConversionService getConversionService() {
		// TODO Auto-generated method stub
		return super.getConversionService();
	}

	@Override
	public void addPropertyEditorRegistrar(PropertyEditorRegistrar registrar) {
		// TODO Auto-generated method stub
		super.addPropertyEditorRegistrar(registrar);
	}

	@Override
	public Set<PropertyEditorRegistrar> getPropertyEditorRegistrars() {
		// TODO Auto-generated method stub
		return super.getPropertyEditorRegistrars();
	}

	@Override
	public void registerCustomEditor(Class<?> requiredType, Class<? extends PropertyEditor> propertyEditorClass) {
		// TODO Auto-generated method stub
		super.registerCustomEditor(requiredType, propertyEditorClass);
	}

	@Override
	public void copyRegisteredEditorsTo(PropertyEditorRegistry registry) {
		// TODO Auto-generated method stub
		super.copyRegisteredEditorsTo(registry);
	}

	@Override
	public Map<Class<?>, Class<? extends PropertyEditor>> getCustomEditors() {
		// TODO Auto-generated method stub
		return super.getCustomEditors();
	}

	@Override
	public void setTypeConverter(TypeConverter typeConverter) {
		// TODO Auto-generated method stub
		super.setTypeConverter(typeConverter);
	}

	@Override
	protected TypeConverter getCustomTypeConverter() {
		// TODO Auto-generated method stub
		return super.getCustomTypeConverter();
	}

	@Override
	public TypeConverter getTypeConverter() {
		// TODO Auto-generated method stub
		return super.getTypeConverter();
	}

	@Override
	public void addEmbeddedValueResolver(StringValueResolver valueResolver) {
		// TODO Auto-generated method stub
		super.addEmbeddedValueResolver(valueResolver);
	}

	@Override
	public boolean hasEmbeddedValueResolver() {
		// TODO Auto-generated method stub
		return super.hasEmbeddedValueResolver();
	}

	@Override
	public String resolveEmbeddedValue(String value) {
		// TODO Auto-generated method stub
		return super.resolveEmbeddedValue(value);
	}

	@Override
	public void addBeanPostProcessor(BeanPostProcessor beanPostProcessor) {
		// TODO Auto-generated method stub
		super.addBeanPostProcessor(beanPostProcessor);
	}

	@Override
	public int getBeanPostProcessorCount() {
		// TODO Auto-generated method stub
		return super.getBeanPostProcessorCount();
	}

	@Override
	public List<BeanPostProcessor> getBeanPostProcessors() {
		// TODO Auto-generated method stub
		return super.getBeanPostProcessors();
	}

	@Override
	protected boolean hasInstantiationAwareBeanPostProcessors() {
		// TODO Auto-generated method stub
		return super.hasInstantiationAwareBeanPostProcessors();
	}

	@Override
	protected boolean hasDestructionAwareBeanPostProcessors() {
		// TODO Auto-generated method stub
		return super.hasDestructionAwareBeanPostProcessors();
	}

	@Override
	public void registerScope(String scopeName, Scope scope) {
		// TODO Auto-generated method stub
		super.registerScope(scopeName, scope);
	}

	@Override
	public String[] getRegisteredScopeNames() {
		// TODO Auto-generated method stub
		return super.getRegisteredScopeNames();
	}

	@Override
	public Scope getRegisteredScope(String scopeName) {
		// TODO Auto-generated method stub
		return super.getRegisteredScope(scopeName);
	}

	@Override
	public void setSecurityContextProvider(SecurityContextProvider securityProvider) {
		// TODO Auto-generated method stub
		super.setSecurityContextProvider(securityProvider);
	}

	@Override
	public AccessControlContext getAccessControlContext() {
		// TODO Auto-generated method stub
		return super.getAccessControlContext();
	}

	@Override
	public BeanDefinition getMergedBeanDefinition(String name) throws BeansException {
		// TODO Auto-generated method stub
		return super.getMergedBeanDefinition(name);
	}

	@Override
	public boolean isFactoryBean(String name) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return super.isFactoryBean(name);
	}

	@Override
	public boolean isActuallyInCreation(String beanName) {
		// TODO Auto-generated method stub
		return super.isActuallyInCreation(beanName);
	}

	@Override
	protected boolean isPrototypeCurrentlyInCreation(String beanName) {
		// TODO Auto-generated method stub
		return super.isPrototypeCurrentlyInCreation(beanName);
	}

	@Override
	protected void beforePrototypeCreation(String beanName) {
		// TODO Auto-generated method stub
		super.beforePrototypeCreation(beanName);
	}

	@Override
	protected void afterPrototypeCreation(String beanName) {
		// TODO Auto-generated method stub
		super.afterPrototypeCreation(beanName);
	}

	@Override
	public void destroyBean(String beanName, Object beanInstance) {
		// TODO Auto-generated method stub
		super.destroyBean(beanName, beanInstance);
	}

	@Override
	protected void destroyBean(String beanName, Object bean, RootBeanDefinition mbd) {
		// TODO Auto-generated method stub
		super.destroyBean(beanName, bean, mbd);
	}

	@Override
	public void destroyScopedBean(String beanName) {
		// TODO Auto-generated method stub
		super.destroyScopedBean(beanName);
	}

	@Override
	protected String transformedBeanName(String name) {
		// TODO Auto-generated method stub
		return super.transformedBeanName(name);
	}

	@Override
	protected String originalBeanName(String name) {
		// TODO Auto-generated method stub
		return super.originalBeanName(name);
	}

	@Override
	protected void initBeanWrapper(BeanWrapper bw) {
		// TODO Auto-generated method stub
		super.initBeanWrapper(bw);
	}

	@Override
	protected void registerCustomEditors(PropertyEditorRegistry registry) {
		// TODO Auto-generated method stub
		super.registerCustomEditors(registry);
	}

	@Override
	protected RootBeanDefinition getMergedLocalBeanDefinition(String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return super.getMergedLocalBeanDefinition(beanName);
	}

	@Override
	protected RootBeanDefinition getMergedBeanDefinition(String beanName, BeanDefinition bd)
			throws BeanDefinitionStoreException {
		// TODO Auto-generated method stub
		return super.getMergedBeanDefinition(beanName, bd);
	}

	@Override
	protected RootBeanDefinition getMergedBeanDefinition(String beanName, BeanDefinition bd,
			BeanDefinition containingBd) throws BeanDefinitionStoreException {
		// TODO Auto-generated method stub
		return super.getMergedBeanDefinition(beanName, bd, containingBd);
	}

	@Override
	protected void checkMergedBeanDefinition(RootBeanDefinition mbd, String beanName, Object[] args)
			throws BeanDefinitionStoreException {
		// TODO Auto-generated method stub
		super.checkMergedBeanDefinition(mbd, beanName, args);
	}

	@Override
	protected Class<?> resolveBeanClass(RootBeanDefinition mbd, String beanName, Class<?>... typesToMatch)
			throws CannotLoadBeanClassException {
		// TODO Auto-generated method stub
		return super.resolveBeanClass(mbd, beanName, typesToMatch);
	}

	@Override
	protected Object evaluateBeanDefinitionString(String value, BeanDefinition beanDefinition) {
		// TODO Auto-generated method stub
		return super.evaluateBeanDefinitionString(value, beanDefinition);
	}

	@Override
	protected boolean isFactoryBean(String beanName, RootBeanDefinition mbd) {
		// TODO Auto-generated method stub
		return super.isFactoryBean(beanName, mbd);
	}

	@Override
	protected void markBeanAsCreated(String beanName) {
		// TODO Auto-generated method stub
		super.markBeanAsCreated(beanName);
	}

	@Override
	protected void cleanupAfterBeanCreationFailure(String beanName) {
		// TODO Auto-generated method stub
		super.cleanupAfterBeanCreationFailure(beanName);
	}

	@Override
	protected boolean removeSingletonIfCreatedForTypeCheckOnly(String beanName) {
		// TODO Auto-generated method stub
		return super.removeSingletonIfCreatedForTypeCheckOnly(beanName);
	}

	@Override
	protected boolean hasBeanCreationStarted() {
		// TODO Auto-generated method stub
		return super.hasBeanCreationStarted();
	}

	@Override
	public boolean isBeanNameInUse(String beanName) {
		// TODO Auto-generated method stub
		return super.isBeanNameInUse(beanName);
	}

	@Override
	protected boolean requiresDestruction(Object bean, RootBeanDefinition mbd) {
		// TODO Auto-generated method stub
		return super.requiresDestruction(bean, mbd);
	}

	@Override
	protected void registerDisposableBeanIfNecessary(String beanName, Object bean, RootBeanDefinition mbd) {
		// TODO Auto-generated method stub
		super.registerDisposableBeanIfNecessary(beanName, bean, mbd);
	}

	@Override
	protected Class<?> getTypeForFactoryBean(FactoryBean<?> factoryBean) {
		// TODO Auto-generated method stub
		return super.getTypeForFactoryBean(factoryBean);
	}

	@Override
	protected Object getCachedObjectForFactoryBean(String beanName) {
		// TODO Auto-generated method stub
		return super.getCachedObjectForFactoryBean(beanName);
	}

	@Override
	protected Object getObjectFromFactoryBean(FactoryBean<?> factory, String beanName, boolean shouldPostProcess) {
		// TODO Auto-generated method stub
		return super.getObjectFromFactoryBean(factory, beanName, shouldPostProcess);
	}

	@Override
	protected FactoryBean<?> getFactoryBean(String beanName, Object beanInstance) throws BeansException {
		// TODO Auto-generated method stub
		return super.getFactoryBean(beanName, beanInstance);
	}

	@Override
	protected void addSingleton(String beanName, Object singletonObject) {
		// TODO Auto-generated method stub
		super.addSingleton(beanName, singletonObject);
	}

	@Override
	protected void addSingletonFactory(String beanName, ObjectFactory<?> singletonFactory) {
		// TODO Auto-generated method stub
		super.addSingletonFactory(beanName, singletonFactory);
	}

	@Override
	public Object getSingleton(String beanName) {
		// TODO Auto-generated method stub
		return super.getSingleton(beanName);
	}

	@Override
	protected Object getSingleton(String beanName, boolean allowEarlyReference) {
		// TODO Auto-generated method stub
		return super.getSingleton(beanName, allowEarlyReference);
	}

	@Override
	public Object getSingleton(String beanName, ObjectFactory<?> singletonFactory) {
		// TODO Auto-generated method stub
		return super.getSingleton(beanName, singletonFactory);
	}

	@Override
	protected void onSuppressedException(Exception ex) {
		// TODO Auto-generated method stub
		super.onSuppressedException(ex);
	}

	@Override
	public boolean containsSingleton(String beanName) {
		// TODO Auto-generated method stub
		return super.containsSingleton(beanName);
	}

	@Override
	public String[] getSingletonNames() {
		// TODO Auto-generated method stub
		return super.getSingletonNames();
	}

	@Override
	public int getSingletonCount() {
		// TODO Auto-generated method stub
		return super.getSingletonCount();
	}

	@Override
	public void setCurrentlyInCreation(String beanName, boolean inCreation) {
		// TODO Auto-generated method stub
		super.setCurrentlyInCreation(beanName, inCreation);
	}

	@Override
	public boolean isCurrentlyInCreation(String beanName) {
		// TODO Auto-generated method stub
		return super.isCurrentlyInCreation(beanName);
	}

	@Override
	public boolean isSingletonCurrentlyInCreation(String beanName) {
		// TODO Auto-generated method stub
		return super.isSingletonCurrentlyInCreation(beanName);
	}

	@Override
	protected void beforeSingletonCreation(String beanName) {
		// TODO Auto-generated method stub
		super.beforeSingletonCreation(beanName);
	}

	@Override
	protected void afterSingletonCreation(String beanName) {
		// TODO Auto-generated method stub
		super.afterSingletonCreation(beanName);
	}

	@Override
	public void registerDisposableBean(String beanName, DisposableBean bean) {
		// TODO Auto-generated method stub
		super.registerDisposableBean(beanName, bean);
	}

	@Override
	public void registerContainedBean(String containedBeanName, String containingBeanName) {
		// TODO Auto-generated method stub
		super.registerContainedBean(containedBeanName, containingBeanName);
	}

	@Override
	public void registerDependentBean(String beanName, String dependentBeanName) {
		// TODO Auto-generated method stub
		super.registerDependentBean(beanName, dependentBeanName);
	}

	@Override
	protected boolean isDependent(String beanName, String dependentBeanName) {
		// TODO Auto-generated method stub
		return super.isDependent(beanName, dependentBeanName);
	}

	@Override
	protected boolean hasDependentBean(String beanName) {
		// TODO Auto-generated method stub
		return super.hasDependentBean(beanName);
	}

	@Override
	public String[] getDependentBeans(String beanName) {
		// TODO Auto-generated method stub
		return super.getDependentBeans(beanName);
	}

	@Override
	public String[] getDependenciesForBean(String beanName) {
		// TODO Auto-generated method stub
		return super.getDependenciesForBean(beanName);
	}

	@Override
	protected void destroyBean(String beanName, DisposableBean bean) {
		// TODO Auto-generated method stub
		super.destroyBean(beanName, bean);
	}

	@Override
	public void registerAlias(String name, String alias) {
		// TODO Auto-generated method stub
		super.registerAlias(name, alias);
	}

	@Override
	public boolean hasAlias(String name, String alias) {
		// TODO Auto-generated method stub
		return super.hasAlias(name, alias);
	}

	@Override
	public void removeAlias(String alias) {
		// TODO Auto-generated method stub
		super.removeAlias(alias);
	}

	@Override
	public boolean isAlias(String name) {
		// TODO Auto-generated method stub
		return super.isAlias(name);
	}

	@Override
	public void resolveAliases(StringValueResolver valueResolver) {
		// TODO Auto-generated method stub
		super.resolveAliases(valueResolver);
	}

	@Override
	protected void checkForAliasCircle(String name, String alias) {
		// TODO Auto-generated method stub
		super.checkForAliasCircle(name, alias);
	}

	@Override
	public String canonicalName(String name) {
		// TODO Auto-generated method stub
		return super.canonicalName(name);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
