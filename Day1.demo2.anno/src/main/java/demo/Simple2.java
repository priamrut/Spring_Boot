package demo;

import org.springframework.stereotype.Component;

public class Simple2 {
	public Simple2(int no) {
		System.out.println("Simple2 Constructor invoked");
	}
	public void m1() {
		System.out.println("m1 invoked  from Simple2");
	}
}
