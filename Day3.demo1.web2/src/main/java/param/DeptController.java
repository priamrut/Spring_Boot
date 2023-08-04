package param;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dept")
public class DeptController {
	@Autowired
	private DeptDAO dao;
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Dept> list() {
		System.out.println("DeptController - list invoked - GET");
		return dao.list();
	}
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity create(@RequestBody Dept d) {
		System.out.println("DeptController - create invoked  - POST");
		dao.add(d);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	@DeleteMapping(value="/{deptno}")
	public ResponseEntity delete(@PathVariable(name="deptno")int deptno) {
		System.out.println("DeptController - delete invoked  - delete" + deptno);
		if (dao.delete(deptno)) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
		
	

}
