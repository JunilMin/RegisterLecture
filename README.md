


************


MILESTONE
1. 과제 내용 분석
2. 모델링 및 ERD 작성
3. 시퀀스 다이어그램 작성
4. API 명세서 작성
5. 기능 개발


************


************


1. 잔액 충전/조회
잔액충전
endpoint: POST/charge
RequestBody


잔액조회
Response


-유저 개인이 잔액을 충전한다. 기존 잔액에 충전되는 금액만큼 더해진다.


-본인의 잔액을 조회할 수 있다.

3. 상품 조회
endpoint: GET/products
Response


-상품 id / 상품명으로 상품을 조회할 수 있다.


-해당 상품의 재고와 가격을 표시한다.

5. 주문 / 결제
endpoint: POST/orders
RequestBody


-유저가 상품을 주문한다 -> 주문할 상품의 총 가격 = 가격 * 수량 을 표시한다.


-주문 내역을 조회할 수 있으며, 주문 상태를 확인할 수 있다.

6. 인기 판매 상품 조회
endpoint:GET/top


-가장 최근 일주일을 기준으로 판매량 기준으로 상위 5개의 상품을 나열한다.


************
![image](https://github.com/JunilMin/hanghae99_2-/assets/86759172/ef90da1b-4af0-4277-8b77-4fe3bb076ea8)











