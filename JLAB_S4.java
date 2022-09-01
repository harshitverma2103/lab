public class JLAB_S4 {
    public static void main(String[] args) {
        T1(15);
        int[] numArr = { 21, 4, 12, 32, 33 };
        T2(numArr);
        int[] numberArr = { 10, 0, 3, 4, 5 };
        T3(numberArr);
        T4( 94);
    }

    public static void T1(int n) {
        if (n % 3 == 0) {
            System.out.println(n + ":Yes");
        } else {
            System.out.println(n + ":No");
        }
    }

    public static void T2(int[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
            T1( numArr[i]);  
        }
    }

    public static void T3(int[] numberArr) {
        int size = 0;
        for (int i = 0; i < numberArr.length; i++) {
            int n = numberArr[i];
            if (n % 5 != 0 || n == 0) {
                size = size + 1;
            }
        }
        System.out.println(size);
    }

    public static void T4(int marks) {
        if (marks >= 90) {
            System.out.println("grade A");
        } else if (marks >= 75) {
            System.out.println("grade B");
        } else if (marks >= 40) {
            System.out.println("grade C");
        } else {
            System.out.println("Fail");
        }
    }
}
