public class JLAB_M4 {
    public static void main(String[] args) {
        T1("trisect");
        T1("java");
        T1("ABC");
        T2("trisect");
        T2("ABC");
        T3("WOWXMAS");
        T3("A+X=20");
        T3("OX");
        T4(8);
        T4(4);
        T5(1);
        T5(5);
        T5(8);
        T5(12);
        T6('A');
        T6('C');
        T6('B');
        T6('X');
        T6('5');
        T7("1234", "567");
        T7("8", "10");
        T8("1234");
        T8("801040");
        T8("6");
        T8("4");
        T9("12", "03", "2016");
        T9("08", "11", "1980");
        T9("24", "06", "2001");
        T9("01", "01", "2018");
        T10("HELLO");
        T10("SUMMER");
    }

    public static void T1(String word) {
        System.out.println("First 3 = " + word.substring(0, 3));
        System.out.println("Last 3 = " + word.substring(word.length() - 3, word.length()));
    }

    public static void T2(String word) {
        System.out.println("First Half = " + word.substring(0, word.length() / 2));
        if (word.length() % 2 != 0) {
            System.out.println("Middle Char = " + word.substring(word.length() / 2, word.length() / 2 + 1));
        }
        System.out.println("Last Half = " + word.substring(word.length() - 3, word.length()));
    }

    public static void T3(String word) {
        int num = word.indexOf("X");
        System.out.println("First :" + word.substring(0, num));
        System.out.println("Second :" + word.substring(num + 1));
    }

    public static void T4(int number) {
        String numberString;
        switch (number) {
            case 1:
                numberString = "One";
                break;
            case 2:
                numberString = "Two";
                break;
            case 3:
                numberString = "Three";
                break;
            case 4:
                numberString = "Four";
                break;
            case 5:
                numberString = "Five";
                break;
            case 6:
                numberString = "Six";
                break;
            case 7:
                numberString = "Seven";
                break;
            case 8:
                numberString = "Eight";
                break;
            case 9:
                numberString = "Nine";
                break;
            default:
                numberString = "Invalid number";
                break;
        }
        System.out.println(numberString);
    }

    public static void T5(int month) {
        String monthString;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);
    }

    public static void T6(char word) {
        String wordString;
        switch (word) {
            case 'A':
                wordString = "Apple";
                break;
            case 'C':
                wordString = "Cat";
                break;
            case 'B':
                wordString = "Boy";
                break;
            default:
                wordString = "None";
        }
        System.out.println(wordString);
    }

    public static void T7(String firstNum, String secondNum) {
        if (firstNum.length() > secondNum.length()) {
            System.out.println(firstNum);
        } else {
            System.out.println(secondNum);
        }
    }

    public static void T8(String number) {
        int num = Integer.valueOf(number);
        System.err.println(num);
    }

    public static void T9(String date, String month, String year) {
        String modifiedMonth = "";
        if (month == "01") {
            modifiedMonth = modifiedMonth + "jan";
        } else if (month == "02") {
            modifiedMonth = modifiedMonth + "Feb";
        } else if (month == "03") {
            modifiedMonth = modifiedMonth + "Mar";
        } else if (month == "04") {
            modifiedMonth = modifiedMonth + "Apr";
        } else if (month == "05") {
            modifiedMonth = modifiedMonth + "May";
        } else if (month == "06") {
            modifiedMonth = modifiedMonth + "jun";
        } else if (month == "07") {
            modifiedMonth = modifiedMonth + "jul";
        } else if (month == "08") {
            modifiedMonth = modifiedMonth + "Aug";
        } else if (month == "09") {
            modifiedMonth = modifiedMonth + "Sep";
        } else if (month == "10") {
            modifiedMonth = modifiedMonth + "oct";
        } else if (month == "11") {
            modifiedMonth = modifiedMonth + "Nov";
        } else if (month == "12") {
            modifiedMonth = modifiedMonth + "Dec";
        }
        System.out.println(date + "-" + modifiedMonth + "-" + year);
    }

    public static void T10(String word) {
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (ch == 'L' && word.charAt(index + 1) == 'L') {
                System.out.println("Yes");
                break;
            } else if (ch == 'M' && word.charAt(index + 1) == 'M') {
                System.out.println("Yes");
                break;
            }
        }
    }
}
