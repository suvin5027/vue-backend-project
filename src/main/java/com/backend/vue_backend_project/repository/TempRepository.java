package com.backend.vue_backend_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.vue_backend_project.entity.TempEntity;

@Repository
// TempRepository는 TempEntity를 관리하는 JPA 리포지토리 인터페이스
public interface TempRepository extends JpaRepository<TempEntity, Long> {
	// JpaRepository는 기본적인 CRUD 메서드를 제공하므로, 별도의 메서드를 추가하지 않아도 됨.
}
