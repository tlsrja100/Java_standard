package chapter06_test;

public class Exercise6_22 {

    public static boolean isNumber(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a < '0' || a > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+" ? "+isNumber(str));
        str = "1234o";
        System.out.println(str+" ? "+isNumber(str));
    }
}
