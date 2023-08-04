package demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/third")
public class ThirdController {

	@GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
	public String method1() {
		System.out.println("ThirdController - Method1 invoked ");
		return "plain text";
	}
	@GetMapping(produces = MediaType.TEXT_HTML_VALUE)
	public String method2() {
		System.out.println("ThirdController - Method2 invoked ");
		return "<h1>HTML</h1>";
	}
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public String method3() {
		System.out.println("ThirdController - Method1 invoked ");
		return "{ \"name\": \"morpheus\",  \"job\": \"leader\"}";
	}
	@GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
	public String method4() {
		System.out.println("ThirdController - Method1 invoked ");
		return "<note><to>Tove</to><from>Jani</from><heading>Reminder</heading></note>";
	}
	
}