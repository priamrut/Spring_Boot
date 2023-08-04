package demo;

import org.springframework.stereotype.Component;

@Component(value="ora")
public class OracleConnection implements Connection {

	public void open() {
		System.out.println("OracleConnection Open Method ");	
	}

	public void close() {
		// TODO Auto-generated method stub
		System.out.println("OracleConnection Close Method ");
	}

}
