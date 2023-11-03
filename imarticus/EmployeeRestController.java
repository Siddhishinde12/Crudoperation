package com.imarticus;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class EmployeeRestController {
	
	@RequestMapping("/getemp")
	public EmployeeProducer getEmp() {
		
		EmployeeProducer e = new EmployeeProducer(1,"siddhi");

	  return e;
		
	}

}
