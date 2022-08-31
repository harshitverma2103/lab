public class JLAB_S1 {
    public static void main(String[] args) {
        T1();
        int[] arr = {1,7,9,12};
        T2(arr);
        T3(arr);
    }

    public static int square(int n) {
        return n * n;
    }

    public static int cube(int n) {
        return square(n) * n;
    }

    public static void T1() {
        System.out.println(square(11));
        System.out.println(square(17));
        System.out.println(square(23));
    }

    public static void T2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            System.out.println(square(n));
        }
    }

    public static void T3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            System.out.println(square(n));
            System.out.println(cube(n));
        }
    }
}