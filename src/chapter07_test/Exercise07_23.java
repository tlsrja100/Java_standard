package chapter07_test;

public class Exercise07_23 {

    static double sumArea(Shape[] arr) {
        double result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i].calcArea();
        }
        return result;
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5), new Rectangle(3, 4), new Circle(1)};

        System.out.println("면적의 합 : " + sumArea(arr));
    }
}
