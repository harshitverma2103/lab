public class JLAB_P4 {
    public static void main(String[] args) {
        T1(15);
        T1(0);
        T1(18);
        T2(2);
        T2(5);
        T3(3);
        T3(5);
        T4(2);
    }

    public static void T1(int n) {
        if (n % 5 == 0) {
            System.out.println("HELLO");
        } else {
            System.out.println("Java");
        }
    }

    public static void T2(int n) {
        String empty = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                empty += "x";
            } else {
                empty += "y";
            }
        }
        System.out.println(empty);
    }

    public static void T3(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(n + "# factorial=" + factorial);
    }

    public static void T4(int n) {
        String str = "";
        for (int i = 1; i <= n; i++) {
            str = str + i;
            System.out.println(str);
        }
        String pt = "";
        for (int i = 1; i <= n; i++) {
            pt = pt + i;
            System.out.println(pt);
        }
    }
}