### 1. HTTP에 대해 정리하라

HTTP(HyperText Transfer Protocol)란 서로 다른 시스템들 사이에서 정보를 전송하도록 해주는 애플리케이션 계층의 프로토콜이다.


##### HTTP 특징
- Transfer layer
    HTTP는 TCP와 짝지어져 있어 처음 TCP가 연결을 맺으면 이후 HTTP 메시지가 교환되는 구조이다. TCP를 통해 통신을 하므로 신뢰성있는 통신을 할 수 있다.

- 비연결성
    클라이언트와 서버가 한번 연결을 맺은 후에 클라이언트의 요청에 대해 서버가 응답을 마치면 연결을 끊어버린다.
- 무상태성
    클라이언트의 상태나 과거 연결했던 기록 등을 신경쓰지 않고, 그냥 그 순간 요구하는 것만을 처리한다.

 
일반적인 HTTP 요청은 HTTP 버전 유형, URL, HTTP 메서드, HTTP 요청 헤더, HTTP 본문이 포함된다.


##### HTTP 메서드
- GET: 리소스 조회
- POST: 요청 데이터 처리, 주로 등록에 사용
- PUT: 리소스를 대체, 해당 리소스가 없으면 생성
- PATCH: 리소스 부분 변경
- DELETE: 리소스 삭제
- HEAD: GET과 동일하지만 메시지 부분을 제외하고, 상태 줄과 헤더만 반환
- OPTIONS: 대상 리소스에 대한 통신 가능 옵션(메서드)을 설명(주로 CORS에서 사용)
- CONNECT: 대상 리소스로 식별되는 서버에 대한 터널을 설정
- TRACE: 대상 리소스에 대한 경로를 따라 메시지 루프백 테스트를 수행


##### HTTP 상태 코드
- 1xx (Informational): 요청이 수신되어 처리중
- 2xx (Successful): 요청 정상 처리
    - 200 : 클라이언트의 요청을 정상적으로 수행함
    - 201 : 클라이언트가 어떠한 리소스 생성을 요청, 해당 리소스가 성공적으로 생성됨(POST를 통한 리소스 생성 작업 시)
    - 204 : 클라이언트가 어떠한 리소스 삭제를 요청, 해당 리소스가 성공적으로 삭제됨
- 3xx (Redirection): 요청을 완료하려면 추가 행동이 필요
- 4xx (Client Error): 클라이언트 오류, 잘못된 문법등으로 서버가 요청을 수행할 수 없음
    - 400 : 클라이언트의 요청이 부적절 할 경우 사용하는 응답 코드
    - 401 : 클라이언트가 인증되지 않은 상태에서 보호된 리소스를 요청했을 때 사용하는 응답 코드
    - 403 : 유저 인증상태와 관계 없이 응답하고 싶지 않은 리소스를 클라이언트가 요청했을 때 사용하는 응답 코드
    - 404 : 클라이언트가 요청한 리소스에서는 사용 불가능한 Method를 이용했을 경우 사용하는 응답 코드
- 5xx (Server Error): 서버 오류, 서버가 정상 요청을 처리하지 못함
    - 500 : 서버에 문제가 있을 경우 사용하는 응답 코드
    - 502 : 게이트웨이 오류




### 2. HTTPS가 무엇인지 정리하고, HTTP와 비교하라

HTTPS(Hypertext Transfer Protocol Secure)는 HTTP의 확장 버전 또는 더 안전한 버전으로, HTTP 요청 및 응답을 SSL 및 TLS 기술에 결합한다.

HTTPS 웹 사이트는 독립된 인증 기관(CA)에서 SSL/TLS 인증서를 획득해야 하는데, 이러한 웹 사이트는 신뢰를 구축하기 위해 데이터를 교환하기 전에 브라우저와 인증서를 공유한다. 


##### HTTP와 HTTPS의 차이

##### 보안
HTTP 메시지는 일반 텍스트이므로 권한이 없는 당사자가 인터넷을 통해 쉽게 액세스하고 읽을 수 있는 반면, HTTPS는 모든 데이터를 암호화된 형태로 전송한다. HTTPS는 퍼블릭 키 암호화에 SSL 인증서를 사용하여 보안성을 높인다.

###### 성능 및 분석
HTTPS 웹 애플리케이션은 HTTP 애플리케이션보다 로드 속도가 더 빠르다. 또한 HTTPS는 참조 링크도 더 잘 추적한다.

###### 포트
HTTP는 기본 포트가 80이며 HTTPS의 기본 포트는 443이다.



### 3. 아래 API에 대한 RESTful한 URI를 설계하라. 

- 이벤트 목록 조회 GET/events
- 이벤트 조회 GET /events/{eventId}
- 이벤트 등록 POST /events
- 이벤트 수정 PUT /events/{eventId}
- 이벤트 삭제 DELETE /events/{eventId}
- 이벤트 상태 변경 PUT /events/{eventId}/conditions/{condition_id}
- 특정 이벤트의 주문 목록 조회 GET /events/{eventId}/orders/{order_id} 
- 멤버 목록 조회 GET /members
- 특정 멤버 권한 변경 PUT /members/{memberID}/authorities{authority_id}
- 특정 멤버 정보 조회 GET /members/{memberID}/informations{information_id}
- 특정 멤버 정보 변경 PUT /members/{memberID}/informations{information_id}
- 멤버 등록 POST /members