public class JLAB_P3 {
    public static void main(String[] args) {
        T1(17);
        T1(14);
        T2(5);
        T2(4);
        System.out.println(T3(2));
        System.out.println(T3(4));
        System.out.println(T3(5));
        T4(2);
        T4(3);
        T4(5);
    }

    public static void T1(int n) {
        if (n % 2 == 0) {
            System.out.println("institute");
        } else {
            System.out.println("Trisect");
        }
    }

    public static void T2(int n) {
        for (int i = 1; i <= n; i++) {
            String empty = "";
            if (i % 3 == 0) {
                empty = empty + "pespsi_" + i;
                System.out.println(empty);
            } else {
                empty = empty + "coke_" + i;
                System.out.println(empty);
            }
        }
    }

    public static String T3(int n) {
        int num = n;
        String result = "";
        for (int i = 1; i <= n; i++) {
            num = num * 2;
            result = result + "#" + num;
        }
        return result;
    }

    public static void T4(int n) {
        for (int i = 1; i <= n; i++) {
            String result = "";
            result = result + "#";
            System.out.println(result);
        }
        int num = n;
        for (int i = 1; i <= n; i++) {
            String result = "";
            result = result + num;
            System.out.println(result);
            num = num - 1;
        }
    }
}
