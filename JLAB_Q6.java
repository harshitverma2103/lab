public class JLAB_Q6 {
    public static void main(String[] args) {
        int[] numArr = { 4, 12, 17, 21 };
        for (int index = 0; index < numArr.length; index++) {
            System.out.println(T1(numArr[index]));
        }
        int[] numberArr = { 10, 5, 3, 4, 25, 6 };
        System.out.println(T2(numberArr));
        int[] numberArray = { 2, 3, 5, 10 };
        T3(numberArray);
    }

    public static int T1(int number) {
        int result = 0;
        if (number % 3 == 0) {
            result += number * 2;
        } else {
            result += number;
        }
        return result;
    }

    public static int T2(int[] numberArr) {
        int result = 0;
        for (int index = 0; index < numberArr.length; index++) {
            if (numberArr[index] % 5 == 0) {
                result += numberArr[index];
            }
        }
        return result;
    }

    public static void T3(int[] numberArray) {
        int result1 = 0;
        int result2 = 0;
        for (int index = 0; index < numberArray.length; index++) {
            if (numberArray[index] < 3) {
                result1 += numberArray[index];
            }
            if (numberArray[index] > 3) {
                result2 += numberArray[index];
            }
        }
        System.out.println("below3=" + result1);
        System.out.println("Above3=" + result2);
    }
}
