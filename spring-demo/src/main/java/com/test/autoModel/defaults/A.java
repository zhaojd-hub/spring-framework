package com.test.autoModel.defaults;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

@Component
@Slf4j(topic = "log")
public class A implements ExampleAware {
	
	ExampleBean exampleBean;
	
	public A() {
		log.debug("default Constructor");
	}
	
	public A(B b, C c) {
		log.debug("Constructor from b and c");
	}
	
	public A(C c) {
		log.debug("Constructor from c");
	}
	
	public A(B b) {
		log.debug("Constructor from b");
	}
	
	@Override
	public void setExampleBean(ExampleBean exampleBean) {
		this.exampleBean = exampleBean;
	}
}
