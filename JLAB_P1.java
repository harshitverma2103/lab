public class JLAB_P1 {
    public static void main(String[] args) {
        System.out.println(T1(23, 77));
        System.out.println(T1(10, 20));
        System.out.println(T2(2));
        System.out.println(T2(4));
        T3(2);
        T3(3);
    }

    public static int T1(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public static int T2(int number) {
        int sumOfCubes = 0;
        for(int i = 1; i <= number; i++){
            sumOfCubes = sumOfCubes + i * i * i;
        }
        return sumOfCubes;
    }

    public static void T3(int n) {
        for(int i = 1; i <= n ; i++){
            System.out.println(i);
        }  
    }
}
