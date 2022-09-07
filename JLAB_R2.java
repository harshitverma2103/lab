public class JLAB_R2 {
    public static void main(String[] args) {
        int[] numArr = { 1, 5, 9, 7 };
        System.out.println(T1(numArr));
        int[] numberArr = { 1, 7, 8, 9 };
        T2(numberArr);
        int[] numberArray = { 9, 99, 999, 9999 };
        T3(numberArray);
        T4("Trisect");
        T4("NEWS360");
    }

    public static int T1(int[] numArr) {
        int smallNumber = numArr[0];
        int largeNumber = numArr[0];
        for (int index = 0; index < numArr.length; index++) {
            if (numArr[index] < smallNumber) {
                smallNumber = numArr[index];
            }
            if (numArr[index] > largeNumber) {
                largeNumber = numArr[index];
            }
        }
        return smallNumber + largeNumber;
    }

    public static void T2(int[] numberArr) {
        String numberString = "";
        int size = 0;
        for (int index = 0; index < numberArr.length; index++) {
            int number = numberArr[index];
            if (number % 2 != 0) {
                numberString += number + "#";
                size++;
            }
        }
        System.out.println("size=" + size);
        System.err.println(numberString);
    }

    public static void T3(int[] numberArray) {
        int result = 0;
        for (int index = 0; index < numberArray.length; index++) {
            if (numberArray[index] >= 3 && numberArray[index] <= 99) {
                if (numberArray[index] % 3 == 0) {
                    result = numberArray[index];
                }
                System.out.println(result);
            }
        }
    }

    public static void T4(String word) {
        int lowerCharCount = 0;
        int upperCharCount = 0;
        int digitsCharCount = 0;
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (ch >= 'a' && ch <= 'z') {
                lowerCharCount++;
            } else if (ch >= 'A' && ch <= 'Z') {
                upperCharCount++;
            } else if (ch >= '0' && ch <= '9') {
                digitsCharCount++;
            }
        }
        System.out.println("Upper#" + upperCharCount);
        System.out.println("Lower#" + lowerCharCount);
        System.out.println("Digits#" + digitsCharCount);
    }
}
