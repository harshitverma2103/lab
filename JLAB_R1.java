public class JLAB_R1 {
    public static void main(String[] args) {
        int[] numArr = { 237, 199, 200, 196, 104 };
        T1(numArr);
    }

    public static void T1(int[] numArr) {

        for (int index = 0; index < numArr.length; index++) {
            if (numArr[index] % 4 == 0 && numArr[index] >= 100 && numArr[index] <= 200) {
                System.out.println(numArr[index]);
            }
        }
    }
}
