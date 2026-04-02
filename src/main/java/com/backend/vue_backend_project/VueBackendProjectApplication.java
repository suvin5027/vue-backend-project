package com.backend.vue_backend_project;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // 1. 데이터를 보내주기 위해 추가!
@CrossOrigin(origins = "http://localhost:5173") // 2. Vue 접속 허용 (통행증!)
public class VueBackendProjectApplication {
	
	public static void main(String[] args) {
			SpringApplication.run(VueBackendProjectApplication.class, args);
	}

}