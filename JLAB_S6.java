public class JLAB_S6 {
    public static void main(String[] args) {
        T1_1("Work");
        T1_1("Fax");
        T1_1("CODE");
        String[] charArr = { "TEST", "car", "AbaCas" };
        T1_2(charArr);
        T4_1(2);
        T4_2(2);
        T4_1(4);
        T4_2(4);
    }

    public static void T1_1(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'b' || ch == 'c' || ch == 'd' || ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D') {
                count = count + 1;
            }
        }
        System.out.println("In Range = " + count);
    }

    public static void T1_2(String[] charArr) {
        for (int i = 0; i < charArr.length; i++) {
            T1_1(charArr[i]);
        }
    }

    public static String T4_1(int n) {
        String star = "*";
        String starLine = "";
        for (int i = 1; i <= n; i++) {
            starLine = starLine + star;
        }
        return starLine;
    }

    public static void T4_2(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i + T4_1(n));
            } else {
                System.out.println(T4_1(n) + i);
            }
        }
    }
}
