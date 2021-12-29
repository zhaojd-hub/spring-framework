package com.test.autoModel.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;

import lombok.extern.slf4j.Slf4j;

/**
 * @author jdzhao2
 */
@Slf4j(topic = "log")
public class ModelBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
		AbstractBeanDefinition beanDefinition =
				(AbstractBeanDefinition) beanFactory.getBeanDefinition("a");
		
		log.debug("mode:{}", beanDefinition.getAutowireMode());
		// m.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
		
		// 给我们A对象设置他的注入模型 = 3
		beanDefinition.setAutowireMode(3);
		// beanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
		// a.getPropertyValues().add("exampleBean",beanFactory.getBean("exampleBean"));
		// beanFactory.ignoreDependencyType(ExampleBean.class);
	}
}
