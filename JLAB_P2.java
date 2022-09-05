public class JLAB_P2 {
    public static void main(String[] args) {
        System.out.println(T1(2));
        System.out.println(T1(4));
        System.out.println(T2(5));
        T3(10);
        T4(3);
    }

    public static int T1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i * i * i;
        }
        return sum;
    }

    public static int T2(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            num += i * i + 1;
        }
        return num;
    }

    public static void T3(int n) {
        int table = 0;
        for (int i = 1; i <= n; i++) {
            table = 5 * i;
            System.out.println("5*" + i + "=" + table);
        }
    }

    public static void T4(int n) {
        String hash = "#";
        String empty = "";
        for (int i = 1; i <= n; i++) {
            empty += hash;
            System.out.println(empty);
        }
    }
}
