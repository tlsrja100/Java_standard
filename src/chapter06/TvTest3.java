package chapter06;

public class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1 의 channel 값은 " + t1.channel + "입니다. ");
        System.out.println("t2 의 channel 값은 " + t2.channel + "입니다. ");

        t2 = t1;    // t1 이 가지고 있는 주소값을 t2에 저장한다.
        t1.channel = 7;
        System.out.println("t1 의 channel 을 7로 변경하였습니다.");

        System.out.println("t1 의 channel 값은 " + t1.channel + "입니다. ");
        System.out.println("t2 의 channel 값은 " + t2.channel + "입니다. ");
    }
}
