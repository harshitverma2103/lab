public class JLAB_S5 {
    public static void main(String[] args) {
        T1("Trisect");
        String[] arr = { "TEST", "HeeL", "car" };
        T2(arr);
        T3("trisect", 1);
    }

    public static void T1(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count = count + 1;
            }
        }
        System.out.println("LowerCount-" + count);
    }

    public static void T2(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            T1(arr[i]);
        }
    }

    public static void T3(String word, int n) {
        String qstr = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (n == 1 && i % 2 == 0) {
                qstr = qstr + "#" + ch;
            }
        }
        System.out.println(qstr);
    }
}
