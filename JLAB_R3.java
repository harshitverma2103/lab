public class JLAB_R3 {
    public static void main(String[] args) {
        System.out.println(T1("ab34"));
        System.out.println(T1("Bad"));
        System.out.println(T1("bAt$5"));
        System.out.println(T1("ab5455"));
        T2("hello");
        T2("trisect");
    }

    public static String T1(String word) {
        String result = "";
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (ch == 'a') {
                result += "x";
            } else if (ch == 'b') {
                result += "yy";
            } else {
                result += '#';
            }
        }
        return result;
    }

    public static void T2(String word) {
        String result = "";
        String charAdd = "";
        String hash = "#";
        for (int index = word.length() - 1; index >= 0; index--) {
            char ch = word.charAt(index);
            if (ch >= 'a' && ch <= 'z') {
                result += ch;
            }
            charAdd += hash;
            hash = hash ;
            System.out.println(result + charAdd);
        }
    }
}
