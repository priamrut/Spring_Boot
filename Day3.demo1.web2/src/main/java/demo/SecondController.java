package demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/second")
public class SecondController {
	@GetMapping(value="/s1")
	public String method1() {
		System.out.println("SecondController - Method1 invoked - GET");
		return "<h1>Get Request on Second s1</h1>";
	}
	@GetMapping(value="/s2")
	public String method2() {
		System.out.println("SecondController - Method2 invoked - GET");
		return "<h1>Get Request on Second s2</h1>";
	}
}

