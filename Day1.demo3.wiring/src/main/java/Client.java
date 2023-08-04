import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import demo.Connection;
import demo.DeptDAO;
@ComponentScan(basePackages = "demo")
public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Client.class);
		System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
		DeptDAO dao = ctx.getBean("dao", DeptDAO.class);
//		Connection con = ctx.getBean("ora", Connection.class);
//		dao.setCon(con);
		dao.insert();
	}

}
