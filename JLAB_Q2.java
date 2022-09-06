public class JLAB_Q2 {
    public static void main(String[] args) {
        T1("exactly");
        T1("mayday");
        T2("car");
        T2("TriSecT");
        T3("MostWanted50");
        T3("JAVA360");
        T3("100");
        T3("Hello");
    }

    public static void T1(String word) {
        int xCount = 0;
        int yCount = 0;
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (ch == 'x') {
                xCount++;
            } else if (ch == 'y') {
                yCount++;
            }
        }
        System.out.println("x" + "#" + xCount);
        System.out.println("y" + "#" + yCount);
    }

    public static void T2(String word) {
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (ch >= 'A' && ch <= 'Z') {
                System.out.println(ch + ":capital");
            } else if (ch >= 'a' && ch <= 'z') {
                System.out.println(ch + ":small");
            }
        }
    }

    public static void T3(String word) {
        int charCount = 0;
        int numberCount = 0;
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (ch >= '0' && ch <= '9') {
                numberCount++;
            } else {
                charCount++;
            }
        }
        System.out.println("Digits-" + numberCount);
        System.out.println("Alphabets-" + charCount);
    }
}
