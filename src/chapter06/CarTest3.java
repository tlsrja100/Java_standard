package chapter06;

public class CarTest3 {
    public static void main(String[] args) {
        CarTe c1 = new CarTe();
        CarTe c2 = new CarTe(c1);

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);

        c1.door = 100;
        System.out.println("c1.door=100; 수행 후");
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
    }
}

class CarTe {
    String color;
    String gearType;
    int door;

    CarTe() {
        this("white", "auto", 4);
    };

    CarTe(CarTe c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    CarTe(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}


