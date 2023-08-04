package param;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class DeptDAO {
		private List<Dept> list = new ArrayList<Dept>();
        
        public void add(Dept d){
        	System.out.println("DeptDAO - add invoked with " + d);
        	list.add(d);
        }
        public List<Dept> list(){
        	System.out.println("DeptDAO - list invoked ");
            return list;
        }
        public boolean delete(int deptno) {
        	System.out.println("DeptDAO - delete invoked " + deptno);
        	for(int i = 0;i<list.size();i++) {
        		if (list.get(i).getDeptno()==deptno) {
        			list.remove(i);
        			return true;
        		}
        	}
        	return false;
        }
   }

