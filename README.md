# 프로젝트 안내 (README)
이 프로젝트는 Vue 연습용 백엔드로, Spring Boot 기반 Java 애플리케이션입니다.

## 프로젝트 정보
- 프로젝트명: vue-backend-project
- Group Id: com.backend
- Artifact Id: vue-backend-project
- 패키지명: com.backend.vue_backend_project
- Spring Boot 버전: 3.5.13
- Java 버전: 21
- 언어: Java
- 목적: Vue 프론트엔드 연습용 백엔드 API/DB 연동

## 주요 의존성
1. Spring Web
2. Lombok
3. MariaDB Driver
4. Spring Data JPA

## 시작하기
1. 데이터베이스 설정
	- `src/main/resources/application.properties`에 MariaDB 연결 정보 추가
	- 예시:
		```properties
		spring.datasource.url=jdbc:mariadb://localhost:3306/vue_db
		spring.datasource.username=root
		spring.datasource.password=your_password
		spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
		spring.jpa.hibernate.ddl-auto=update
		```
2. 빌드 및 실행
	- Windows:
		```bash
		mvnw.cmd spring-boot:run
		```
	- macOS/Linux:
		```bash
		./mvnw spring-boot:run
		```

## 참고 문서
- Spring Boot 3.5.13 레퍼런스: https://docs.spring.io/spring-boot/3.5.13/reference/html/
- Maven 가이드: https://maven.apache.org/guides/index.html
- Spring Web: https://docs.spring.io/spring-boot/3.5.13/reference/web/servlet.html
- Spring Data JPA: https://docs.spring.io/spring-boot/3.5.13/reference/data/sql.html#data.sql.jpa-and-spring-data

## 개발 가이드
- REST API 작성: https://spring.io/guides/gs/rest-service/
- JPA로 데이터 접근: https://spring.io/guides/gs/accessing-data-jpa/

## 유의사항
- 원래 패키지명 `com.backend.vue_backend-project`는 유효하지 않으므로 `com.backend.vue_backend_project`로 사용하고 있습니다.


