package com.backend.vue_backend_project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "TB_TEMP") // 테이블 이름 설정 : 실제 DB의 테이블 이름과 일치해야 함
@Getter
public class TempEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 기본 키 자동 생성 전략 설정
	private Long id; // 아이디 (기본 키)
	private String title; // 제목
	private String content; // 내용
}
