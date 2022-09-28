public class JLAB_M6 {
    public static void main(String[] args) {
        T1(5);
        T2(5);
        T3(5);
        T5(5);
        T7(5);
    }

    public static void T1(int number) {
        String result = "";
        for (int index = 1; index <= number; index++) {
            result += index;
            System.out.println(result);
        }
    }

    public static void T2(int number) {
        String result = "";
        for (int index = 1; index <= number; index++) {
            if (index % 2 == 0) {
                result += '0';
                System.out.println(result);
            } else {
                result += '1';
                System.out.println(result);
            }
        }
    }

    public static void T3(int number) {
        String result = "";
        String star = "";
        for (int index = 1; index <= number; index++) {
            star += '*';
            result += index;
            System.out.println(result + star);
        }
    }

    public static void T5(int number) {
        String result = "";
        int num = number;
        for (int index = 1; index <= number; index++) {
            result += num;
            System.out.println(result);
            num = num - 1;
        }
    }

    public static void T7(int number) {
        for (int i = 1; i <= number; i++) {
            String pattern = "";
            for (int j = 1; j <= i; j++) {
                pattern += i;
            }
            System.out.println(pattern);
        }
    }
}