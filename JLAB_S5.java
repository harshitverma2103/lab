public class JLAB_S5 {
    public static void main(String[] args) {
        T1_1("Trisect");
        T1_1("HELLO");
        T1_1("Za");
        String[] arr = { "TEST", "HeeL", "car" };
        T1_2(arr);
        T2("trisect", 1);
        T2("hello", 0);
    }

    public static void T1_1(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count = count + 1;
            }
        }
        System.out.println("LowerCount-" + count);
    }

    public static void T1_2(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            T1_1(arr[i]);
        }
    }

    public static void T2(String word, int n) {
        String qstr = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (n == 1) {
                if (i % 2 == 0) {
                    qstr = qstr + ch;
                } else {
                    qstr = qstr + "#";
                }
            }    
            else  {
                if(n == 0) {
                    qstr = qstr + "#";
                } else if (i % 2 != 0) {
                   qstr = qstr + ch;
                 }
            }
        }
        System.out.println(qstr);  
    }
}
