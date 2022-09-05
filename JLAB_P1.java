public class JLAB_P1 {
    public static void main(String[] args) {
        System.out.println(T1(23, 77));
        System.out.println(T1(10, 20));
        System.out.println(T2(2));
        System.out.println(T2(4));
        T3(2);
        T3(3);
    }

    public static int T1(int a, int b) {
        return a + b;
    }

    public static int T2(int number) {
        int sum = 0;
        for(int i = 1; i <= number; i++){
            sum = sum + i * i* i;
        }
        return sum;
    }

    public static void T3(int n) {
        for(int i = 1; i <= n ; i++){
            System.out.println(i);
        }  
    }
}
