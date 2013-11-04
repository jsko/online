package com.aop.main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintHandler implements InvocationHandler {

	private Object target;
	public LogPrintHandler(Object target) {
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
        Log log = LogFactory.getLog(this.getClass());
		
		StopWatch sw= new StopWatch();
		sw.start();
		log.info("타이머시작");
		
		Object result = method.invoke(target, args);
		
		sw.stop();
		log.info("타이머정지");
		log.info("[TimerLog]Process Time:"+sw.getTotalTimeMillis());
		
		return result;
	}

}
