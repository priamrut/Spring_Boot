package demo;

import org.springframework.stereotype.Component;

@Component(value="mysql")
public class MySQLConnection implements Connection {

	public void open() {
		System.out.println("MySQLConnection Open Method ");	
	}

	public void close() {
		// TODO Auto-generated method stub
		System.out.println("MySQLConnection Close Method ");
	}

}
