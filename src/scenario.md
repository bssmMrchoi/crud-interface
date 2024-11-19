## 제네릭 인터페이스를 설계하고 이를 기반으로 다양한 서비스(UserService 등)를 구현하는 예제
* 사용자 관리 시스템을 개발하고자 함
* 테이블(클래스) 명 : ```user```
* 필드 : ```id:Long```, ```name:String```, ```email:String```, ```password:String```, ```createAt:String```
* ```CrudService<T>```을 설계하고 이를 기반으로 ```UserService```를 구현


class - 하나의 자료형
generic : <T> - 사용할 때(실행) 타입이 결정
인터페이스 : 하나의 명세서