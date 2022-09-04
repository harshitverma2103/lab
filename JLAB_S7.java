public class JLAB_S7 {
    public static void main(String[] args) {
        T1_1(2);
        T1_1(9);
        T1_1(0);
        int[] numArr = { 4, 3, 10 };
        T1_2(numArr);
        System.out.println(T3("hello"));
        String[] charArr = { "dad", "car", "dat" };
        for (int i = 0; i < charArr.length; i++) {
            String str1 = charArr[i];
            String addChar = T4(str1);
            System.out.println(addChar);
        }
    }

    public static void T1_1(int inputNumber) {
        int square = inputNumber * inputNumber;
        System.out.println(inputNumber + " square = " + square);
    }

    public static void T1_2(int[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
            T1_1(numArr[i]);
        }
    }

    public static String T3(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'l') {
                result = result + ch;
            }
        }
        return result;
    }

    public static String T4(String str1) {
        String modifiedString = "";
        for (int j = 0; j < str1.length(); j++) {
            char ch = str1.charAt(j);
            if (ch != 'd') {
                modifiedString = modifiedString + ch;
            }
        }
        return modifiedString;
    }
}
