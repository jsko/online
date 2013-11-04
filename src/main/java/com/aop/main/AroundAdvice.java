package com.aop.main;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class AroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		Log log = LogFactory.getLog(this.getClass());

		StopWatch sw= new StopWatch();
		sw.start();
		log.info("Ÿ�̸ӽ���");
		
		Object result =  method.proceed();
		
		sw.stop();
		log.info("Ÿ�̸�����");
		log.info("TimerLog]Method :"+method.getMethod());
		log.info("[TimerLog]Process Time:"+sw.getTotalTimeMillis());
		
		return result;
	}
	

}




