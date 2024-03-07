package com.HAH.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class AdvisorDemo implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("--------------------");
		System.out.printf("%-15s : %s%n".formatted("Target Class", target.getClass().getSimpleName()));
		System.out.printf("%-15s : %s%n".formatted("Target Method", method.getName()));
		System.out.println("--------------------");
	}

}
