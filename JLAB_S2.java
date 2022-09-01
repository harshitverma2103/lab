public class JLAB_S2 {
    public static void main(String[] args) {
        System.out.println(T1(2));
        int[] arr = { 3, 5, 8 };
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            T2(n, 4);
            T2(n, 5);
        }
            T3(2);
            T4("hello");
    }

    public static int T1(int n) {
        return n * n + n * n * n;
    }

    public static void T2(int n, int times) {
        int result = 1;
        for (int i = 1; i <= times; i++) {
            result = result * n;
        }
        System.out.println(times + "thPower-" + n + "=" + result);
    }

    public static void T3(int n) {
        String newstr = "";
        for (int i = 1; i <= n; i++) {
            newstr = newstr + "*" + "*" + i;
            System.out.println(newstr);
        }
    }

    public static void T4(String str) {
        int len = str.length();
        String hash = "#";
        String stringReverse = "";
        for (int i = len - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            stringReverse = stringReverse + hash + ch;
        }
        System.out.println(stringReverse + hash + str + hash);
    }
}
