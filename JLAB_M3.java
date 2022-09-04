public class JLAB_M3 {
    public static void main(String[] args) {
        int[] arr = { 4, 14, 6, 12, 345, 5, 1 };
        System.out.println("single digits:" + T1(arr));
    }

    public static int T1(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            if (n >= 0 && n <= 9) {
                result = result + 1;
            }
        }
        return result;
    }
}
