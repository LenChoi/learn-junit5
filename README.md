# JUnit 5 User Guide

## 어노테이션
- @BeforeEach
  각각의 테스트 메서드 전에 실행
  
- @AfterEach
  각각의 테스트 메서드 후에 실행
  
- @BeforeAll
  모든 테스트 메서드 전에 실행
  
- @AfterAll
  모든 테스트 메서드 후에 실행
  
- @Nested
  계층 구조의 테스트 코드를 작성할 수 있음
  
- @Tag
  필터링 테스트를 위한 태그들을 정의
  
- @Disabled
  테스트 클래스나 메서드를 비활성화 하는데 사용
  
- @Timeout
  실행이 주어진 시간을 초과할 경우 테스트 실패를 하는데 사용
  
## 이름 표시
- @DisplayName: 테스트 클래스, 메소드의 이름을 출력해준다(공백, 특수문자, 이모지 등 사용 가능)
- @DisplayNameGenerator 기능 
  - Simple: 파라미터가 없는 후행 괄호를 제거
  - ReplaceUnderscores: 언더스코어를 공백으로 바꿔줌
  - IndicativeSentences: 클래스명 + 구분자(", ") + 메소드명으로 출력
  
## Assertions
- assertEquals(excepted, actual)
- assertNotNull(actual)
- assertTrue(boolean)
- assertAll(executables) - 여러 검증을 하나의 테스트로 묶어서 검사
- assertTimeout(duration, executable)
- assertTimeoutPreemptively(duration, executable)
