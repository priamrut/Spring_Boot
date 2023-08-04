package demo;

import org.springframework.aop.ThrowsAdvice;

public class MyExHandler implements ThrowsAdvice{

	public void afterThrowing(Exception ex) {
		System.out.println("-------------------------------------------EXCEPTION " + ex);
	}

}
