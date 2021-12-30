package chapter07_test;

public class Exercise07_27 {
    public static void main(String[] args) {

        Outerrr r = new Outerrr();
        Outerrr.Inner inner = r.new Inner();
        inner.method1();
    }
}

class Outerrr {
    int value = 10;

    class Inner {
        int value = 20;

        void method1() {
            int value = 30;
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outerrr.this.value);
        }
    } // Inner클래스의 끝
} // Outer클래스의 끝


