package com.example.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());

	//AfterReturning+AfterThrowing=After
	
	
	//execution (* PACKAGE.*.*(..))
//	@AfterReturning(value="execution (* com.example.spring.aop.springaop.data.*.*(..))",returning="result" )
	@AfterReturning(value="com.example.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()",returning="result" )
	public void afterReturning(JoinPoint joinPoint,Object result)
	{
		logger.info("{} returned with value {}",joinPoint,result);
	}
	@AfterThrowing(value="com.example.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()",throwing="exception" )
	public void afterThrowing(JoinPoint joinPoint,Exception exception)
	{
		logger.info("{} returned with value {}",joinPoint,exception);
	}
	@After(value="com.example.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void after(JoinPoint joinPoint)
	{
		logger.info("after aspect {}",joinPoint);
	}

}
