public class JLAB_M3 {
    public static void main(String[] args) {
        int[] numberArr = { 4, 14, 6, 12, 345, 5, 1 };
        System.out.println("single digits:" + T1(numberArr));
        int[] numArr = { 44, 9, 100, 104 };
        T5(numArr);
    }

    public static int T1(int[] numberArr) {
        int result = 0;
        for (int i = 0; i < numberArr.length; i++) {
            int n = numberArr[i];
            if (n >= 0 && n <= 9) {
                result = result + 1;
            }
        }
        return result;
    }

    public static void T5(int[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
            int result = 0;
            int e = numArr[i];
            if (e % 3 == 0 || e % 4 == 0) {
                if (e % 12 != 0) {
                    if (e >= 3 && e <= 99) {
                        result = result + e;
                        System.out.println(result);
                    }
                }
            }
        }
    }
}
