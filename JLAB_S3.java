public class JLAB_S3 {
    public static void main(String[] args) {
        T1(4);
        int[] arr = { 10, 9, 12, 5, 7 };
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            T2(n);
        }
        T3(4);
        int[] numberarr = { 5, 13, 15, 20, 36 };
        for (int i = 0; i < numberarr.length; i++) {
            int n = arr[i];
            T4(n);
        }
    }

    public static void T1(int n) {
        if (n % 2 == 0) {
            System.out.println(n + ":" + "even");
        } else {
            System.out.println(n + ":" + "odd");
        }
    }

    public static void T2(int n) {
        if (n % 2 == 0) {
            System.out.println(n + ":" + "even");
        } else {
            System.out.println(n + ":" + "odd");
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

    public static void T4(int n) {
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
}
