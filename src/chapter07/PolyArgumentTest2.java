package chapter07;

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Stv());
        b.buy(new Computer());
        b.buy(new Audio());
        b.summary();
    }
}
