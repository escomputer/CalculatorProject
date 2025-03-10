📍프로젝트 개요
-----------------------
  이 프로젝트는 자바의 기본 문법과 객체 지향 프로그래밍의 개념을 익혀나가는 과정에서 수행한 프로젝트입니다.<br>
 기본적인 사칙연산(+,-,*,/)을 수행하는 Java 기반 계산기 프로그램입니다.<br>
클래스를 사용하지 않은 절차적 프로그래밍부터 최종 람다/스트림/Enum 등을 적용하는 과정을 거쳤습니다.<br>
연산 결과는 최대 5개까지 저장하며, 사용자가 입력한 값보다 큰 결과를 필터링하여 조회할 수 있습니다.

✏️ 기술 스택 
-----------------
<b>언어</b> : Java <br>
<b>기능</b> : 제네릭, 스트림 API, 예외 처리, 람다

💻 기능 설명
--------------------
1️⃣ <b>사칙연산 수행</b>
<ul>
  <li>
    (+, -, *, /) 연산이 가능합니다.
  </li>
  <li>
    나눗셈 연산에서 0으로 나누는 경우 예외 처리됩니다.
  </li>
  <li>
    연산 결과는 소수점 셋째 자리까지 반올림 됩니다.
  </li>
  <li>
    추가 연산 진행을 원치 않는다면 exit를 입력하고 종료할 수 있습니다.
  </li>
</ul>

2️⃣ <b>최근 5개 결과 저장 및 관리</b>
<ul>
  <li>
    결과는 Double타입의 List로 저장되며, 5개를 초과하면 가장 오래된 값이 자동으로 삭제됩니다.(FIFO)
  </li>
  
</ul>

3️⃣ <b>입력한 값보다 큰 결과 조회</b>
<ul>
  <li>
    사용자가 특정 값을 입력하면, 해당 값보다 큰 연산 결과를 필터링하여 출력합니다.
  </li>
  <li>
    숫자가 아닌 값을 입력하면, 조회 기능을 건너뜁니다.
  </li>
  
  
</ul>

💖 예제 실행 결과
---------------
<b>❣️ 오류 3종 세트 </b>

<img width="384" alt="Image" src="https://github.com/user-attachments/assets/dd22ac95-7087-4568-9044-67ef7eb553a7" /> <br><br>
<b>❣️ 조회 기능 건너뛰기</b>

<img width="568" alt="Image" src="https://github.com/user-attachments/assets/8e280d24-c9f4-4a6e-a1f1-456b6a78c6ef" /><br><br>
<b>❣️ FIFO 기능 + exit 입력시 계산기 종료 기능 + 입력한 값보다 큰 결과 조회</b>

<img width="594" alt="Image" src="https://github.com/user-attachments/assets/cdff4db9-2a94-4b7c-810a-bea5d046b425" />

✅ 플로우 차트
-------
<img width="679" alt="Image" src="https://github.com/user-attachments/assets/a48fc7c3-ba73-45be-b7aa-5dfda212609f" />
