public class JLAB_Q1 {
    public static void main(String[] args) {
        T1("ZZZ");
        T1("zackz");
        T1("ratcatmat");
        T2("tRiSeCt100");
        T2("allsmall");
        T2("ALLCAPS");
    }

    public static void T1(String word) {
        int count = 0;
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (ch == 'Z') {
                count = count + 1;
            }
        }
        System.out.println(count);
    }

    public static void T2(String word) {
        int count1 = 0;
        int count2 = 0;
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (ch >= 'a' && ch <= 'z') {
                count1 = count1 + 1;
            } else if (ch >= 'A' && ch <= 'Z') {
                count2 = count2 + 1;
            }
        }
        System.out.println("Lower =" + count2);
        System.out.println("Upper =" + count1);
    }
}
