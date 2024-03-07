package com.HAH.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCuts {

	@Pointcut("execution(* search*(..))")
	public void searchPointCut() {
		
	}
	
	@Pointcut("within(com..member.dao.*)")
	public void withinPointCut() {
		
	}
	
	@Pointcut("@within(com.HAH.aspect.AdminAnnotation)")
	public void annotationWithinPoitCut() {
		
	}
}
