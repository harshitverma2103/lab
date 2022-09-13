public class JLAB_M3 {
    public static void main(String[] args) {
        int[] numberArr = { 4, 14, 6, 12, 345, 5, 1 };
        System.out.println("single digits:" + T1(numberArr));
        int[] numArr = { 44, 9, 100, 104 };
        T5(numArr);
    }

    public static int T1(int[] numberArr) {
        int count = 0;
        for (int i = 0; i < numberArr.length; i++) {
            int n = numberArr[i];
            if (n >= 0 && n <= 9) {
                count = count + 1;
            }
        }
        return count;
    }

    public static void T5(int[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
            int result = 0;
            int number = numArr[i];
            if (number % 3 == 0 || number % 4 == 0) {
                if (number % 12 != 0) {
                    if (number >= 3 && number <= 99) {
                        result = result + number;
                        System.out.println(result);
                    }
                }
            }
        }
    }
}
