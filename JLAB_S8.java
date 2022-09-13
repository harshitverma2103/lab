public class JLAB_S8 {
    public static void main(String[] args) {
        System.out.println(T1(2, 12));
        System.out.println(T1(9, 1));
        System.out.println(T1(3, 0));
        int[] numberArr = { 4, 3, 10 };
        T1_2(numberArr);
        System.out.println(T3_1("trisect", 't'));
        System.out.println(T3_1("hello", 'l'));
        String[] charArr = { "dad", "car", "tiptop" };
        for (int i = 0; i < charArr.length; i++) {
            //String str = charArr[i];
        }     
    }

    public static int T1(int n, int m) {
        int result = 0;
        if (m % 2 == 0) {
            result = n * n * n;
        } else {
            result = n * n;
        }
        return result;
    }

    public static void T1_2(int[] numberArr) {
        for (int i = 0; i < numberArr.length; i++) {
            System.out.println(T1(numberArr[i], i));
        }
    }

    public static String T3_1(String str, char ch1) {
        String empty1 = "";
        String empty2 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ch1) {
                empty1 = empty1 + ch;
            } else {
                empty2 = empty2 + ch1;
            }
        }
        empty1 = empty1 + empty2;
        return empty1;
    }

    public static void T3_1(String str ) {
        for (int j = 0; j < str.length(); j++) {
          //  char ch = str.charAt(j);
    }
}
}
