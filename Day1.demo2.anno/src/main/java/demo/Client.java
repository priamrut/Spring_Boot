package demo;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan(basePackages = "demo")
public class Client {
	@Bean(value ="s2")
	@Scope(value="prototype")
	public Simple2 method() {
		System.out.println("method of Client invoked ");
		return new Simple2(1);
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Client.class);
		System.out.println("----------------CTX Loaded-----------------");
		System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
		Simple s1 = ctx.getBean("simple", Simple.class);
		s1.m1();
		Simple s2 = ctx.getBean("simple", Simple.class);
		s2.m1();
		Simple2 s3 = ctx.getBean("s2", Simple2.class);
		s3.m1();
	}
}
