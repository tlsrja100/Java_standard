package chapter06;

public class CarTest2 {
    public static void main(String[] args) {
        CarT c1 = new CarT();
        CarT c2 = new CarT("blue");

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
    }
}

class CarT {
    String color;
    String gearType;
    int door;

    CarT() {
        this("white", "auto", 4);
    };

    CarT(String color) {
        this(color, "auto", 4);
    }

    CarT(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}


