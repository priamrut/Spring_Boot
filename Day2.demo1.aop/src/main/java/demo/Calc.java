package demo;

import org.springframework.stereotype.Component;
// Target
@Component
public class Calc {
	
	 public int add(int a , int b) {
		 System.out.println("in calc add with " + a + ",  "+ b);
		 return a+b;
	 }
     public int divide(int a , int b) {
    	 System.out.println("in calc divide with " + a + ",  "+ b);
		 return a/b;
     }
}
