package chapter07_test;

public class Exercise07_29 {
    // [7-29] 지역 클래스에서 외부 클래스의 인스턴스멤버와 static 멤버에 모두 접근할 수 있지만 지역변수는 final 이 붙은 상수만
    // 접근할 수 있는 이유 무엇인가 ?

    // 메서드가 수행을 마쳐서 지역변수가 소멸된 시점에도 지역 클래스의 인스턴스가 ,
    // 소멸된 지역변수를 참조하려는 경우가 발생할 수 있기 때문이다.
}

