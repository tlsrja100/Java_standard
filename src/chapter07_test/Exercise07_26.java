package chapter07_test;

public class Exercise07_26 {
    public static void main(String[] args) {
    /*
    (1) 알맞은 코드를 넣어 완성하시오.
    */
        Outerr.Inner i = new Outerr.Inner();
        System.out.println(i.iv);
    }
}

class Outerr {
    static class Inner {
        int iv = 200;
    }
}

