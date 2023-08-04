package demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "dao")
public class DeptDAO {

	@Autowired
	@Qualifier(value = "mysql")
	private Connection con;
	 
	public DeptDAO() {
		System.out.println("DeptDAO constructor - "+ con);
	}
	@PostConstruct
	public void m1() {
		System.out.println("m1 from DeptDAO " + con);
	}
	
	public void insert(){
		System.out.println("con = " + con);
		con.open();
		System.out.println("insert into dept values ..."); 
		con.close(); 
	}
}
