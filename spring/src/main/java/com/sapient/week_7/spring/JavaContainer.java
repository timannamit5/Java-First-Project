package com.sapient.week_7.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaContainer {
	
		@Bean
		public emp_pojo emp3() {
			emp_pojo emp = new emp_pojo();
			emp.setId(3);
			emp.setName("roya");
			emp.setCity("delhi");
			return emp;
		}

		@Bean
		public emp_pojo emp4() {
			emp_pojo emp = new emp_pojo();
			emp.setId(4);
			emp.setName("royi");
			emp.setCity("delhi");
			return emp;
		}
}
