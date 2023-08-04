package demo;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "demo")
public class Client {
	// Proxy
	@Bean(name = "calc")
	public Calc method() {
		ProxyFactoryBean proxy = new ProxyFactoryBean();
		proxy.setTarget(new Calc());
		NameMatchMethodPointcutAdvisor pointcutadvisor = new NameMatchMethodPointcutAdvisor();
		pointcutadvisor.addMethodName("divide");
		pointcutadvisor.setAdvice(new MyLogging());
		proxy.addAdvisor(pointcutadvisor);
//		proxy.addAdvice(new MyLogging());
		proxy.addAdvice(new MyExHandler());	
		return (Calc)proxy.getObject();
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Client.class);
		System.out.println("------------Context Loaded --------------");
		Calc c1= ctx.getBean("calc", Calc.class);
		int ans = c1.add(100, 10);
		System.out.println("Add of 100, 10 returned " + ans);
		ans = c1.divide(100, 10);
		System.out.println("Divide of 100, 10 returned " + ans);
		ans = c1.divide(10, 0);
		System.out.println("Divide of 10, 0 returned " + ans);
	
	}
}
