package demo;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


public class Client {

	public static void main(String[] args) {
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DatabaseConfiguration.class);
         DeptDAO dao = ctx.getBean("deptdao", DeptDAO.class);
         for (int i = 10;i<100; i+=10) {
        	 Dept d= new Dept(i,"DNameof"+i,"Pnq");
        	if ((i %20)==0)
        		d.setLoc("Blr");
        	 dao.insert(d);
         }
         dao.list().forEach(System.out::println);
	}
}
