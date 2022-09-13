public class JLAB_R4 {
    public static void main(String[] args) {
        T1(2);
        T1(5);
        System.out.println(T2("Top20"));
        System.out.println(T2("car"));
        System.out.println(T2("HellO"));
        System.out.println(T2("1GOAL9"));
        T3("who");
        T3("code");
        T4("java");
        T4("89");
    }

    public static void T1(int number) {
        String result = "";
        int num = number;
        for (int index = 1; index <= number; index++) {
            result += num;
            System.out.println(result);
            num = num - 1;
        }
    }

    public static String T2(String word) {
        String modifiedString = "";
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (ch >= 'A' && ch <= 'Z') {
                modifiedString = modifiedString + ch + ch;
            } else if (ch >= '0' && ch <= '9') {
                modifiedString = modifiedString + '#';
            } else {
                modifiedString = modifiedString + ch;
            }
        }
        return modifiedString;
    }

    public static void T3(String word) {
        String result = "";
        for (int index = word.length() - 1; index >= 0; index--) {
            char ch = word.charAt(index);
            result += ch;
        }
        System.out.println(word + "#" + result);
    }

    public static void T4(String word) {
        String result = "";
        String star = "*";
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            result += star;
            System.out.println(result + ch);
        }
    }
}
