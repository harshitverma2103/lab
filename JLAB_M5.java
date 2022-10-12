public class JLAB_M5 {
    public static void main(String[] args) {
        T1(1);
        T1(2);
        T1(29);
        T1(39);
        T1(97);
        T1(361);
        T3(6);
        T3(29);
        T3(104);
        T3(125);
        T4(20);
        T5(2);
        T5(80);
        T5(127);
        T5(192);
        T5(256);
        T5(1024);
        T6("1#2##3###hello");
        T6("##A###B#C#D");
        T6("job#Ready#Java");
        T7(2);
        T7(4);
        T8(29013);
        T8(28);
        T8(6);
        T8(205);
        T8(10);
        int[] numberArray = { 10, 25, 456, 67 };
        T10(numberArray);
        T11(6);
        T11(8);
        T11(15);
        T11(45);
        T12("10000");
        T12("1111111");
        T12("10101");
        T12("1");
        T12("0");
    }

    public static void T1(int number) {
        int result = 0;
        int tempNum = number / 2;
        if (number == 0 || number == 1) {
            System.out.println(number + " is not a prime number");
        } else {
            for (int index = 2; index <= tempNum; index++) {
                if (number % 1 == 0) {
                    System.out.println(number + "is not a prime number");
                    result = 1;
                    break;
                }
            }
            if (result == 0) {
                System.out.println(number + "is a prime number");
            }
        }
    }

    public static void T3(int number) {
        if (number % 5 == 0) {
            System.out.println("Buzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 15 == 0) {
            System.out.println("Fizzbuzz");
        } else {
            System.out.println("Nothing");
        }
    }

    public static void T4(int number) {
        for (int index = 1; index <= number; index++) {
            if (index % 5 == 0) {
                System.out.print("Buzz,");
            } else if (index % 3 == 0) {
                System.out.print("Fizz,");
            } else if (index % 15 == 0) {
                System.out.print("Fizzbuzz,");
            } else {
                System.out.print(index + ",");
            }
        }
    }

    public static void T5(int number) {
        while (number % 2 == 0) {
            number = number / 2;
        }
        if (number == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void T6(String word) {
        String modifiedString = "";
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (ch == '#' && word.charAt(index + 1) == '#') {
                
            } else if (!(ch == '#' && word.charAt(index + 1) == '#')) {
                modifiedString += ch;
            }
        }
        System.out.println(modifiedString);
    }

    public static void T7(int number) {
        String result = "";
        String cross = "";
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= i; j++) {
                result += j;
                cross += "x";
                System.out.println(cross + result);
            }
        }
    }

    public static void T8(int number) {
        int sum = 0;
        while (number != 0) {
            int num = number % 10;
            sum += num;
            number = number / 10;
        }
        System.out.println(sum);
    }

    public static void T10(int[] numberArray) {
        for (int index = 0; index < numberArray.length; index++) {
            int sum = 0;
            int number = numberArray[index];
            while (number != 0) {
                int num = number % 10;
                sum += num;
                number = number / 10;
            }
            System.out.print(sum + ",");
        }
    }

    public static void T11(int number) {
        System.out.println(Integer.toBinaryString(number));
    }

    public static void T12(String binaryNumber) {
        int decimal = Integer.parseInt(binaryNumber, 2);
        System.out.println(decimal);
    }
}
