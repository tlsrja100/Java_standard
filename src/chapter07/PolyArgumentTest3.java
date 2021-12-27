package chapter07;

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Stv tv = new Stv();
        Computer com = new Computer();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }
}
