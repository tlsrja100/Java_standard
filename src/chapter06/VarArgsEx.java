package chapter06;

public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatente("", "100", "200", "300"));
        System.out.println(concatente("-",strArr));
        System.out.println(concatente(",", new String[]{"1","2","3"}));
        System.out.println("["+concatente(",", new String[0]) +"]");
        System.out.println("["+concatente(",")+"]");
    }

    static String concatente(String delim, String... args) {
        String result = "";

        for (String str : args) {
            result += str + delim;
        }
        return result;
    }
}
