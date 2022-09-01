public class JLAB_S3 {
    public static void main(String[] args) {
        T1(4);
        int[] numArr = { 10, 9, 12, 5, 7 };
        T2(numArr);
        T3(4);
        int[] numberArr = { 5, 13, 15, 20, 36 };
        T4(numberArr);
    }

    public static void T1(int n) {
        if (n % 2 == 0) {
            System.out.println(n + ":" + "even");
        } else {
            System.out.println(n + ":" + "odd");
        }
    }

    public static void T2(int[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
            T1(numArr[i]);
        }
    }

    public static void T3(int n) {
        if (n % 2 == 0) {
            System.out.println("pepsi");
        } else if (n % 3 == 0) {
            System.out.println("Coke");
        } else if (n % 2 == 0 || n % 3 == 0) {
            System.out.println("pepsicoke");
        } else {
            System.out.println("paperBoat");
        }
    }

    public static void T4(int[] numberArr) {
        for (int i = 0; i < numberArr.length; i++) {
            T3(numberArr[i]);
        }
    }
}
