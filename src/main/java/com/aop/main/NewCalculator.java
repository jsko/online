package com.aop.main;


public class NewCalculator implements Calculator {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		
		/*Log log = LogFactory.getLog(this.getClass());
		
		StopWatch sw= new StopWatch();
		sw.start();
		log.info("타이머시작");*/
		
		int sum = x+y;
		
		/*sw.stop();
		log.info("타이머정지");
		log.info("[TimerLog]Process Time:"+sw.getTotalTimeMillis());*/
		
		return sum;
		
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int mult(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}

	@Override
	public int add_ex(int x, int y) {
		// TODO Auto-generated method stub
		
		if(x>100)			throw new IllegalArgumentException("100보다 큰 인자를 전달한 예외");
	
		int sum = x+y;
		
		return sum;
	}

}
