public class JLAB_S3 {
    public static void main(String[] args) {
        T1(4);
        int[] numarr = { 10, 9, 12, 5, 7 };
        T2(numarr);
        T3(4);
        int[] numberarr = { 5, 13, 15, 20, 36 };
        T4(numberarr);
    }

    public static void T1(int n) {
        if (n % 2 == 0) {
            System.out.println(n + ":" + "even");
        } else {
            System.out.println(n + ":" + "odd");
        }
    }

    public static void T2(int[] numarr) {
        for (int i = 0; i < numarr.length; i++) {
            int n = numarr[i];
            if (n % 2 == 0) {
                System.out.println(n + ":" + "even");
            } else {
                System.out.println(n + ":" + "odd");
            }
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

    public static void T4(int[] numberarr) {
        for (int i = 0; i < numberarr.length; i++) {
            int n = numberarr[i];
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
}
