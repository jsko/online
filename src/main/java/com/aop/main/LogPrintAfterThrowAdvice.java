package com.aop.main;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

public class LogPrintAfterThrowAdvice implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		
		Log log = LogFactory.getLog(this.getClass());

		log.info("[After throwing]:예외발생");
	}
	
}
