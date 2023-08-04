package demo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component(value = "deptdao")
@Transactional(propagation = Propagation.REQUIRED)
public class DeptDAO {
	@Autowired
	private SessionFactory sf;

	private HibernateTemplate template;

	@PostConstruct
	public void init() {
		this.template = new HibernateTemplate(sf);
	}

	public void insert(Dept d) {
		System.out.println("in insert of " + d);
		template.save(d);
		Dept d1 = new Dept(d.getDeptno()+1, "aa","Blr");
		template.save(d1);
	}

	public void delete(int deptno) {
		System.out.println("in delete of " + deptno);
		Dept d = template.get(Dept.class, deptno);
		if (d == null)
			System.out.println("Not Found for delete");
		else {
			template.delete(d);
			System.out.println("Record Deleted");
		}
	}

	public void update(Dept dept) {
		System.out.println("in update of " + dept.getDeptno());
		Dept d = template.get(Dept.class, dept.getDeptno());
		if (d == null)
			System.out.println("Not Found for Update");
		else {
			d.setDname(dept.getDname());
			d.setLoc(dept.getLoc());
			template.update(d);
			System.out.println("Record Updated");
		}
	}

	public List<Dept> list() {
		System.out.println("in list ");
		return template.loadAll(Dept.class);
	}
}