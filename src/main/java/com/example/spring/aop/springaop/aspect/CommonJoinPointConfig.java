package com.example.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	
	@Pointcut("execution (* com.example.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("execution (* com.example.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}
	
	@Pointcut("com.example.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() && com.example.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void anyLayerExecution() {}
	
	@Pointcut("bean(*Dao*)")
	public void anyBeanContainingDao() {}
	
	@Pointcut("within(com.example.spring.aop.springaop.data..*)")
	public void dataLayerExecutionWithWithin() {}
	
	
	
}
