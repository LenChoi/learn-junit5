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

## Assumptions
- assumeTrue()는 인자로 전달 받은 값이 true이면 테스트 진행, 그렇지 않으면 생략, false인 경우 테스트 실패가 아니라 테스트를 생략하는 것
- assumeFalse()는 false인 경우에만 테스트 진행
- assumingThat의 첫 번째 인자의 값이 True이면, 두 번째 인자로 받은 검증을 수행

## Disabling Tests
- 테스트 클래스 또는 메서드를 비활성화 시킬수 있는데 간단한 설명도 함께 적어줌

## ConditionalTest Execution
- Operating System Conditions
- Java Runtime Environment Conditions
- System Property Conditions
- Environment Variable Conditions
- Custom Conditions

## Tagging and Filtering
- 태그는 null이 불가능
- trimmed 태그는 공백, ISO 제어 문자 포함X
- , ( ) & | ! (예약문자) 사용 불가 
- 메이븐이나 그래들 설정에서 포함할 태그나 제외 할 태그를 지정하여 선택한 테스트를 진행 할 수 있음

## Test Execution Order
- 테스트 메소드는 의도적으로 불명확한 알고리즘을 사용하여 정렬함
- 실제 단위 테스트에서는 순세에 의존하면 안되지만 특정 테스트에서는 실행 순서를 정해줘야 하는 경우가 있을 수 있음

- @TestMethodOrder 중 원하는 MethodOrderer 선택
  - DisplayName(영숫자순으로 정렬)
  - MethodName(메서드 이름과 매개 변수 목록에 따라 영문 숫자 순으로 정렬)
  - OrderAnnotation(@Order 값으로 정렬)
  - Random(무작위로 정렬)
  - Alphanumeric(이름과 형식 매개 변수 목록을 기준으로 영문 숫자 순으로 정렬)
  
## Test Instance Lifecycle
- 개별 테스트 메소드를 개별적으로 실행하고 변경 가능한 테스트 인스턴스 상태로 인한 예상치 못한 부작용을 피하기위해 
  Test 메소드를 실행하기 전에 TestClass의 새 인스턴스를 작성
  
- 동일한 테스트 인스턴스에서 모든 테스트 메소드를 실행하려면 테스트 클래스에 @TestInstance(Lifecycle.PER_CLASS)
사용
  
## Nested Tests
- 테스트 작성자에게 여러 테스트의 그룹들에 관계를 표현하기 위한 더 많은 기능들을 제공해 줌