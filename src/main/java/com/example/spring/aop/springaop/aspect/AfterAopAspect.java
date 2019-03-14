package com.example.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());

	//execution (* PACKAGE.*.*(..))
	@Before("execution (* com.example.spring.aop.springaop.data.*.*(..))")
	public void before(JoinPoint joinPoint)
	{
		logger.info("check for user access");
		logger.info("Allowed execution for - {}",joinPoint);
	}

}
