package com.HAH.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AllAspects {
	
	@Before("bean(adminDao)")
	public void beforeInvocation(JoinPoint joinPoint) {
		System.out.println("Before Invocation");
		System.out.println("--------------------");
		System.out.printf("%-15s : %s%n".formatted("Target Class",joinPoint.getTarget().getClass().getSimpleName()));
		System.out.printf("%-15s : %s%n".formatted("Target Method",joinPoint.getSignature().getName()));
		System.out.println("--------------------");
	}

}
