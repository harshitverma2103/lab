public class JLAB_R5 {
    public static void main(String[] args) {
        T1(100);
        T2(2);
        T2(5);
        T2(3);
        int[] numberArr = { 9, 44, 100, 104 };
        T3(numberArr);
    }

    public static void T1(int number) {
        int num = number;
        String ascendingPattern = "";
        String descendingPattern = "";
        for (int i = 1; i <= number; i++) {
            ascendingPattern += i;
            System.out.println(ascendingPattern);
        }
        for (int j = 1; j <= number; j++) {
            descendingPattern += num;
            System.out.println(descendingPattern);
            num = num - 1;
        }
    }

    public static void T2(int number) {
        int num = number * 2;
        for (int index = 1; index <= number; index++) {
            System.out.print("#" + num);
            num = num - 2;
        }
        System.out.println();
    }

    public static void T3(int[] numberArr) {
        for (int index = 0; index < numberArr.length; index++) {
            if (numberArr[index] % 3 == 0 || numberArr[index] % 4 == 0 && !(numberArr[index] % 12 == 0) & numberArr[index] >= 3 && numberArr[index] <= 99) {
                System.out.println(numberArr[index]);
            }
        }
    }
}
