package com.aop.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Calculator cal = new NewCalculator();
		
		Calculator proxy = (Calculator)Proxy.newProxyInstance(cal.getClass().getClassLoader(),
				cal.getClass().getInterfaces(), new LogPrintHandler(cal));
		
		//System.out.println(cal.add(3, 4));
		System.out.println(proxy.add(3, 4));*/
		ApplicationContext ctx = new GenericXmlApplicationContext("config2.xml");
		Calculator proxy = (Calculator)ctx.getBean("cal");
		//System.out.println(proxy.add(1033, 4));
		//System.out.println(proxy.add_ex(1033, 4));
		System.out.println(proxy.add(1033, 4));
		System.out.println(proxy.sub(1033, 4));
		System.out.println(proxy.mult(1033, 4));
		System.out.println(proxy.div(12, 4));
		
	}

}
