public class JLAB_M0 {
    public static void main(String[] args) {
        T1(2);
        T1(3);
        T2(2);
        T2(3);
        T3(2);
        T3(3);
        T4(2);
        T4(4);
        T5(3);
        T5(4);
        T6(2);
        T6(4);
        T7(2);
        T7(4);
        T8(2);
        T8(4);
    }

    public static void T1(int number) {
        for (int index = 1; index <= number; index++) {
            System.out.println("M" + index);
        }
    }

    public static void T2(int number) {
        String result = "";
        for (int index = 1; index <= number; index++) {
            result += "A";
            System.out.println(result);
        }
    }

    public static void T3(int number) {
        for (int index = 1; index <= number; index++) {
            System.out.println("A" + index + "B" + index);
        }
    }

    public static void T4(int number) {
        int cube = 0;
        for (int index = 1; index <= number; index++) {
            cube = index * index * index;
            System.out.println(cube);
        }
    }

    public static void T5(int number) {
        for (int index = 1; index <= number; index++) {
            if (index % 3 == 0) {
                System.out.println("num=" + index + "rem:" + 0);
            } else {
                System.out.println("num=" + index + "rem:" + index);
            }
        }
    }

    public static void T6(int number) {
        String result = "";
        for (int index = 1; index <= number; index++) {
            result += "y" + index;
            System.out.println(result);
        }
    }

    public static void T7(int number) {
        for (int index = 1; index <= number; index++) {
            String line = "";
            int answer = 0;
            line += index + "*" + index + "-" + index + "=";
            answer += index * index - index;
            System.out.println(line + answer);
        }
    }

    public static void T8(int number) {
        for (int index = 1; index <= number; index++) {
            String line = "";
            int answer = 0;
            line = index + "+" + index + "*" + index + "+" + index + "*" + index + "*" + index + "=";
            answer = index + index * index + index * index * index;
            System.out.println(line + answer);
        }
    }
}
