package chapter07_test;

public class Exercise07_25 {
    public static void main(String[] args) {
    /*
    (1) 알맞은 코드를 넣어 완성하시오.
    */
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        System.out.println(i.iv);
    }
}

class Outer {
    class Inner {
        int iv = 100;
    }
}

