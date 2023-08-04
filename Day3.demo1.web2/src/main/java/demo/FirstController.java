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

// @Controller + ResponseBody
@RestController
@RequestMapping(value = "/first")
public class FirstController {
	@GetMapping
	public String method1() {
		System.out.println("FirstController - Method1 invoked - GET");
		return "<h1>Get Request on first</h1>";
	}
	@PostMapping
	public String method2() {
		System.out.println("FirstController - Method2 invoked  - POST");
		return "<h1>Post Request on first</h1>";
	}
	@PutMapping
	public String method3() {
		System.out.println("FirstController - Method3 invoked - PUT ");
		return "<h1>Put Request on first</h1>";
	}
	@DeleteMapping
	public String method4() {
		System.out.println("FirstController - Method4 invoked - DELETE ");
		return "<h1>Delete Request on first</h1>";
	}
}

