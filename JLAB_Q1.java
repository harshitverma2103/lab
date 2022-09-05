public class JLAB_Q1 {
    public static void main(String[] args) {
        T1("zzz");
        T1("zackz");
        T1("ratcatmat");
        T2("tRiSeCt100");
        T2("allsmall");
        T2("ALLCAPS");
    }

    public static void T1(String word) {
        int charCount = 0;
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (ch == 'z') {
                charCount = charCount + 1;
            }
        }
        System.out.println(charCount);
    }

    public static void T2(String word) {
        int lowerCharCount = 0;
        int upperCharCount = 0;
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (ch >= 'a' && ch <= 'z') {
                lowerCharCount = lowerCharCount + 1;
            } else if (ch >= 'A' && ch <= 'Z') {
                upperCharCount = upperCharCount + 1;
            }
        }
        System.out.println("Upper =" + upperCharCount);
        System.out.println("Lower =" + lowerCharCount);
    }
}
