package param;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rp")
public class RequestParamDemo {
	@GetMapping(value="/hello")
	public String hello(@RequestParam(name = "nm")String name) {
		System.out.println("Hello invoked with "  + name);
		return "<h1>Hello, " + name + "</h1>";
	}
	@GetMapping(value="/add")
	public String add(@RequestParam(name = "n1")int no1, 
			@RequestParam(name = "n2")int no2) {
		System.out.println("Add invoked with "  + no1 + ",  " + no2);
		return "<h1>Sum =  " + (no1+no2)+ "</h1>";
	}
	
}
