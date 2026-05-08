# spring-jwt

## 명세
- 빌드 도구: 그래이들
  - 빌드 스크립트: 코틀린
- 자바: 21
  - 스프링: 자바 21에 종속된 최안정 버전
- 인증 도구: JWT
- 쿼리 도구: JPA
  - DB: MARIADB
  - DB URL: ${MARIADBDOMAIN} 환경 변수 활용
  - DB USERNAME: `powerfulh`
  - DB PW: ${MARIADBPASSWORD} 환경 변수 활용
- 구조: com.powerful.jwt
- 프로필: local, main
- 로깅 패턴:
  - local: `%d{MMdd HH:mm:ss} %-5level %logger{36} - %msg [%thread]%n`
  - main: `%-5level %logger{36} - %msg [%thread]%n`