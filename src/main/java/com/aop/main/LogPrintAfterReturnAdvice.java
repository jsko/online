package com.aop.main;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

public class LogPrintAfterReturnAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args,
			Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		Log log = LogFactory.getLog(this.getClass());

		log.info("[After]:Method:"+method.getName()+",returnValue:"+returnValue +", args"+Arrays.toString(args));
		
	}

}
