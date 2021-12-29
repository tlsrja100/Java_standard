package chapter07_test;

public class Exercise07_14 {
    public static void main(String args[]) {
        SutdaCardd card = new SutdaCardd(1, true);
    }
}

class SutdaCardd {
    final int NUM;
    final boolean IS_KWANG;

    SutdaCardd() {
        this(1, true);
    }

    SutdaCardd(int num, boolean isKwang) {
        this.NUM = num;
        this.IS_KWANG = isKwang;
    }

    public String toString() {
        return NUM + (IS_KWANG ? "K" : "");
    }
}

