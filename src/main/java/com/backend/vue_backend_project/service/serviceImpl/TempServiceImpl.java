package com.backend.vue_backend_project.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.vue_backend_project.dto.TempDTO;
import com.backend.vue_backend_project.entity.TempEntity;
import com.backend.vue_backend_project.repository.TempRepository;
import com.backend.vue_backend_project.service.TempService;

@Service
public class TempServiceImpl implements TempService {

	@Autowired
	private TempRepository tempRepository; // 1. Mapper 대신 Repository 연결

	@Override
	public List<TempDTO> getTempList() {
		// 2.DB에서 Entity 리스트를 가져와서 DTO 리스트로 변환하기
		return tempRepository.findAll().stream().map(entity -> {
			TempDTO dto = new TempDTO();
			dto.setId(entity.getId());
			dto.setTitle(entity.getTitle());
			dto.setContent(entity.getContent());
			return dto;
		}).collect(Collectors.toList());
	}
}
