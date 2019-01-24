package com.xys.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostImple implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(bean+"初始化前Bean的名字:"+beanName);
	  //返回之前的bean,返回bean之前对bean进行一系列的操作修改
		
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println(bean+"初始化后Bean的名字:"+beanName);
		//返回之前的bean
		return bean;
	}

}
