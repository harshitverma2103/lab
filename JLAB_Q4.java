public class JLAB_Q4 {
    public static void main(String[] args) {
        System.out.println(T1("code"));
        System.out.println(T1("dad"));
        System.out.println(T1("dd"));
        System.out.println(T1("dad"));
        System.out.println(T1("trisect"));
        System.out.println(T1("Doodle"));
        System.out.println(T2("Asana"));
        System.out.println(T2("tax"));
        System.out.println(T2("Ace"));
        System.out.println(T2("mix"));
        System.out.println(T3("TableTennis"));
        System.out.println(T3("Raj-Sinha"));
        System.out.println(T3("Top#100"));
        System.out.println(T3("ALLCAPS"));
        System.out.println(T3("small"));
        System.out.println(T4("$dollar$"));
        System.out.println(T4("D$at$"));
        System.out.println(T4("$$"));
        System.out.println(T4("$hash$123"));
    }

    public static String T1(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            result += ch;
            if (ch == 'd') {
                result += ch;
            }
        }
        return result;
    }

    public static String T2(String word) {
        String modifideString = "";
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            modifideString += ch;
            if (ch == 'A') {
                modifideString += 'A';
            }
            if (ch == 'a') {
                modifideString += "a" + "a";
            }
        }
        return modifideString;
    }

    public static String T3(String word) {
        String result = "";
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (!(ch >= 'a' && ch <= 'z')) {
                result += ch;
            }
        }
        return result;
    }

    public static String T4(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch != '$') {
                result += ch;
            }
        }
        return result;
    }
}
