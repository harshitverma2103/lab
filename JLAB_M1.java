public class JLAB_M1 {
    public static void main(String[] args) {
        T1(2);
        T1(4);
        T2(15);
        T2(22);
        T3(4);
        T3(5);
        T4(4);
        T4(6);
        T4(8);
        T5(45);
        T5(56);
        T5(78);
        T5(96);
        T5(75);
        T6(3);
        T7(3, 10);
        T7(4, 5);
        T8(5, 2);
        T8(5, 4);
        T8(7, 3);
        T8(7, 5);
        T9(2);
        T9(4);
        T9(9);
        T10(20, 50);
        T10(21, 65);
        T10(102, 102);
        T10(80, 40);
        T10(96, 1);
        T10(80, 76);
        T11(3);
        T11(4);
        T11(5);
        T12(2456);
        T12(1001);
        T12(9999);
        T12(1234);
    }

    public static void T1(int number) {
        String result = "";
        for (int index = 1; index <= number; index++) {
            result += "y" + index;
            System.out.println(result);
        }
    }

    public static void T2(int number) {
        for (int index = 2; index <= 5; index++) {
            if (number % index == 0) {
                System.out.println(index + ":yes");
            } else {
                System.out.println(index + ":no");
            }
        }
    }

    public static void T3(int number) {
        String result = "";
        for (int index = 1; index <= number; index++) {
            if (index % 2 == 0) {
                result += "B";
                System.out.println(index + ":" + result);
            } else {
                result += "A";
                System.out.println(index + ":" + result);
            }
        }
    }

    public static void T4(int number) {
        String result = "";
        char ch = 'M';
        for (int index = 1; index <= number; index++) {
            result += ch;
            if (ch == 'M') {
                ch = 'N';
            } else if (ch == 'N') {
                ch = 'O';
            } else if (ch == 'O') {
                ch = 'M';
            }
        }
        System.out.print(result);
        System.out.println();
    }

    public static void T5(int number) {
        if (number >= 95) {
            System.out.println("Grade A");
        } else if (number >= 75) {
            System.out.println("Grade B");
        } else if (number >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }

    public static void T6(int number) {
        int result = 3;
        int sum = 0;
        for (int index = 1; index <= number; index++) {
            result += 3 * index;
            sum += result;
        }
        System.out.println(sum);
    }

    public static void T7(int number, int num) {
        int result = 1;
        int sum = 0;
        for (int index = 1; index <= number; index++) {
            result = result * num;
            sum += result;
        }
        System.out.println(sum);
    }

    public static void T8(int num, int number) {
        int result = num;
        for (int index = 1; index <= number; index++) {
            result += num;
            System.out.print(result + "#");
        }
        System.out.println();
    }

    public static void T9(int number) {
        String result1 = "";
        String result2 = "";
        for (int index = 1; index <= number; index++) {
            if (number % index == 0) {
                result1 += index + "#";
            } else {
                result2 += index + "#";
            }
        }
        System.out.println("Divide+" + result1);
        System.out.println("Notdivide=" + result2);
    }

    public static void T10(int firstNum , int secondNum) {
        int hcf = 0;
        for(int index = 1; index <= firstNum || index <= secondNum; index++ ) {
            if( firstNum % index == 0 && secondNum % index == 0){
                hcf = index;
            }
        }
        System.out.println(hcf);
    }

    public static void T11(int number) {
        String result = "";
        String hash = "";
        for(int index = 1; index <= number; index++) {
            hash += "#" ;
            result += index + hash ;
        }
        System.out.print(result);
        System.out.println();
    }

    public static void T12(int number) {
        int sum = 0;
        for(int index = 0; index<=4; index ++) {
            int num = number % 10;
            sum += num;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
