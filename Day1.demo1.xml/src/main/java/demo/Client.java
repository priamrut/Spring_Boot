package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("demo.xml");
		System.out.println("----------------CTX Loaded-----------------");
		Simple s1 = ctx.getBean("sim", Simple.class);
	//		Simple s1 = new Simple();
			s1.m1();
		Simple s2 = ctx.getBean("sim", Simple.class);
			//		Simple s1 = new Simple();
					s2.m1();
	}

}
