public class JLAB_Q5 {
    public static void main(String[] args) {
        int[] numArr = { 1, 3, 4, 7 };
        System.out.println(T1(numArr));
    }

    public static int T1(int[] numArr) {
        int number = 0;
        for (int index = 0; index < numArr.length; index++) {
            number = numArr[index];
            number = number * 10;
        }
        return number;
    }
}
