public class JLAB_M6 {
    public static void main(String[] args) {
        T1(5);
        T2(5);
        T3(5);
        T4(4);
        T5(5);
        T6(5);
        T7(5);
        T8(5);
        T9(5);
        T10(5);
        T11(5);
        T12(5);
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

    public static void T4(int number) {
        String pattern = "";
        for (int i = 1; i <= number; i++) {
            pattern += i;
            System.out.println(pattern);
        }
        if (pattern.length() == number) {
            int num = number;
            for (int i = 1; i <= number; i++) {
                String pattern1 = "";
                for (int j = 1; j <= num; j++) {
                    pattern1 += j;
                }
                num--;
                System.out.println(pattern1);
            }
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

    public static void T6(int number) {
        String pattern = "";
        for (int index = 1; index <= number; index++) {
            pattern = index + pattern;
            System.out.println(pattern);
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

    public static void T8(int number) {
        String pattern = "";
        for (int index = 1; index <= number; index++) {
            if (index == 1) {
                pattern = pattern + index;
                System.out.println(pattern);

            } else {
                pattern = index + pattern + index;
                System.out.println(pattern);
            }
        }
    }

    public static void T9(int number) {
        int num = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void T10(int number) {
        int num = number;
        for (int i = 1; i <= number; i++) {
            String pattern = "";
            for (int j = 1; j <= num; j++) {
                pattern += j;
            }
            num--;
            System.out.println(pattern);
        }
    }

    public static void T11(int number) {
        int tempNum = 1;
        int num = number;
        for (int i = 1; i <= number; i++) {
            String pattern = "";
            for (int j = num; j >= tempNum; j--) {
                pattern += j;
            }
            tempNum++;
            System.out.println(pattern);
        }
    }

    public static void T12(int number) {
        for (int index = 1; index <= number; index++) {
            if (index % 2 == 0) {
                System.out.println("01010");
            } else {
                System.out.println("10101");
            }
        }
    }
}
