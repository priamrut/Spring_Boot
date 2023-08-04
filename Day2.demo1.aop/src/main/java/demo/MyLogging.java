package demo;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
public class MyLogging implements MethodBeforeAdvice, AfterReturningAdvice {

	public void before(Method method, Object[] args, Object obj) throws Throwable {
		System.out.println("----------Before invoked for " + method.getName() + " with params " + Arrays.toString(args));
	}

	public void afterReturning(Object arg0, Method method, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("----------------After Returning for " + method.getName() );
		}

}
