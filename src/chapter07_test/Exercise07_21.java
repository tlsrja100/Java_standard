package chapter07_test;

public class Exercise07_21 {
    // 다음과 같이 attack 메서드가 정의 되어 있을경우 메서드의 매개변수로 가능한 것 두 가지를 적으시오
    interface Movable {
        void move(int x, int y);
    }

    void attack(Movable f) {

    }

    // 정답 : null , Movable 인터페이스를 구현한 클래스 또는 그 자손의 인스턴스
}
