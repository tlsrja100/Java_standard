package chapter07_test;

public class Exercise07_15 {
    // [7-15] 클래스가 다음과 같이 정의되어 있을 때 형변환을 올바르게 하지 않은 것은 ? (모두 고르시오.) ( e )
    // class Unit {}
    // class AirUnit extends Unit {}
    // class GroundUnit extends Unit {}
    // class Tank extends GroundUnit {}
    // class AirCraft extends AirUnit {}

    // Unit u = new GroundUnit();
    // Tank t = new Tank();
    // AirCraft ac = new AirCraft();

    // a.	u = (Unit)ac;
    // b.	u = ac;
    // c.	GroundUnit gu = (GroundUnit)u;
    // d.	AirUnit au = ac;
    // e.	t = (Tank)u;    <- 조상타입의 인스턴스를 자손타입으로 형변환 할 수 없다.
    // f.	GroundUnit gu = t;

}
