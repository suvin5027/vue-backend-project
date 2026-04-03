package com.backend.vue_backend_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.vue_backend_project.dto.TempDTO;
import com.backend.vue_backend_project.service.TempService;


@RestController // 1. 데이터를 보내주기 위해 추가!
@RequestMapping("/api") // 2. API 주소 설정 (통행증!)
@CrossOrigin(origins = "http://localhost:5173") // 3. Vue 접속 허용
public class TempController {

	@Autowired
	private TempService tempService; // 4. 서비스 연결

	@GetMapping("/test")
	public List<TempDTO> getTempList() {
		return tempService.getTempList();
	}

}
