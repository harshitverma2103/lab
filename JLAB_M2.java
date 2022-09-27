public class JLAB_M2 {
    public static void main(String[] args) {
        T1("hello#2$$BD*");
        T1("#@$%^&:[]=@hbQ");
        T1("hihi8900");
        T2("123");
        T2("ABCD");
        T2("PQ");
        T3("12049brt");
        T3("a1b9c3d4QW");
        T3("1234567890");
        T3("Hello");
        T4("ABCDEF");
        T4("BAD CAR");
        T6("jobreadyjava");
        T6("AbCdEf");
        T6("A1B2C3D4E");
        T6("Q");
        T10("Hello");
        T10("My Name Is");
        T10("JAVA");
        T11("Hello");
        T11("My Name is");
        T11("JAVA");
    }

    public static void T1(String word) {
        int result = 0;
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (!(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9')) {
                result += 1;
            }
        }
        System.out.println(result);
    }

    public static void T2(String word) {
        String modifiedString = "";
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            modifiedString += ch;
            System.out.print(modifiedString + "#");
        }
        System.out.println();
    }

    public static void T3(String word) {
        String modifiedString = "";
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (ch == '1') {
                modifiedString += 'A';
            } else if (ch == '2') {
                modifiedString += 'b';
            } else if (ch >= '4' && ch <= '9') {
                modifiedString += 'x';
            } else if (ch == '3') {
                modifiedString += 'c';
            } else {
                modifiedString += ch;
            }
        }
        System.out.println(modifiedString);
    }

    public static void T4(String word) {
        String modifiedString = "";
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (ch == 'A') {
                modifiedString += 'B';
            } else if (ch == 'B') {
                modifiedString += 'A';
            } else if (ch == 'C' || ch == 'D') {

            } else {
                modifiedString += ch;
            }
        }
        System.out.println(modifiedString);
    }

    public static void T6(String word) {
        String modifiedString1 = "";
        String modifiedString2 = "";
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (index % 2 == 0) {
                modifiedString1 += ch;
            } else {
                modifiedString2 += ch;
            }
        }
        System.out.println("Even:" + modifiedString1);
        System.out.println("Odd:" + modifiedString2);
    }

    public static void T10(String word) {
        String modifiedString = word.toLowerCase();
        System.out.println(modifiedString);
    }

    public static void T11(String word) {
        String modifiedString = word.toUpperCase();
        System.out.println(modifiedString);
    }
}
