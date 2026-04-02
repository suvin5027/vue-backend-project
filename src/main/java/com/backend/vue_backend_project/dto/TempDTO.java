package com.backend.vue_backend_project.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
// @Data(롬복)의 단점: 모든 필드에 대해 getter/setter/toString이 자동으로 생성되지만, 때로는 특정 필드에 대해서만 필요한 경우가 있음
// -> 롬복의 @Data는 편리하지만, 예상치 못한 부작용(무한 루프 등)을 방지하기 위해 실무에서는 @Getter, @Setter를 각각 선언하는 것을 권장함.
// DTO(Data Transfer Object): 데이터 전송 객체
public class TempDTO {
	private Long id; // 아이디
	private String title; // 제목
	private String content; // 내용
}
