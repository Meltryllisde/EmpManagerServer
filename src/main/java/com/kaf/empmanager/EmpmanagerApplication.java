package com.kaf.empmanager;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class EmpmanagerApplication {

	@PostConstruct
	public void init() {
		// 设置默认时区为东八区
		TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
	}
	public static void main(String[] args) {
		SpringApplication.run(EmpmanagerApplication.class, args);
	}

}
