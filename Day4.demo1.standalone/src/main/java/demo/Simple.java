package demo;

import org.springframework.stereotype.Component;

@Component
public class Simple {
	public Simple() {
		System.out.println("Simple Constructor invoked");
	}
	public void m1() {
		System.out.println("m1 invoked ");
	}
}
