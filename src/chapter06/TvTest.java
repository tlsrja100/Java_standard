package chapter06;

class TvTest {
    public static void main(String[] args) {
        Tv t;               // Tv 인스턴스를 참조하기 위한 변수 t를 선언
        t = new Tv();       // Tv 인스턴스를 생성한다.
        t.channel = 7;      // Tv 인스턴스의 멤버변수 channel 의 값을 7로 한다.
        t.channelDown();    // Tv 인스턴스의 메서드 channelDown() 을 호출한다.
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}
