public class JLAB_P4 {
    public static void main(String[] args) {
        System.out.println(T1(15));
        System.out.println(T1(0));
        System.out.println(T1(18));
        System.out.println(T2(2));
        System.out.println(T2(5));
        System.out.println(T3(3));
        System.out.println(T3(5));
        T4(2);
        T4(4);
        System.out.println(T5(13, 2));
    }

    public static String T1(int number) {
        String result = "";
        if (number % 5 == 0) {
            result += "HELLO";
        } else {
            result += "JAVA";
        }
        return result;
    }

    public static String T2(int number) {
        String result = "";
        for (int index = 1; index <= number; index++) {
            if (index % 2 == 0) {
                result += "x";
            } else {
                result += "y";
            }
        }
        return result;
    }

    public static int T3(int number) {
        int factorial = 1;
        for (int index = 1; index <= number; index++) {
            factorial = factorial * index;
        }
        return factorial;
    }

    public static void T4(int number) {
        String pettern = "";
        int num = number;
        for (int index = 1; index <= number; index++) {
            pettern += num;
            System.out.println(pettern);
            num = num - 1;
        }
    }

    public static String T5(int number1, int number2) {
        String result = "";
        int num = number1;
        for (int index = 1; index <= number2; index++) {
            result += num + "#";
            num = num * num;
        }
        return result;
    }
}
