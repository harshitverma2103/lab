import javax.xml.transform.Templates;

public class JLAB_M6 {
    public static void main(String[] args) {
        T1(5);
        T2(5);
        T3(5);
        T4(4);
        T5(5);
        T6(5);
        T7(5);
        T8(5);
        T9(5);
        T10(5);
        T11(5);
        T12(5);
        T13(5);
        T14(2);
        T14(5);
        T14(15);
        T15(5);
    }

    public static void T1(int number) {
        String result = "";
        for (int index = 1; index <= number; index++) {
            result += index;
            System.out.println(result);
        }
    }

    public static void T2(int number) {
        String result = "";
        for (int index = 1; index <= number; index++) {
            if (index % 2 == 0) {
                result += '0';
                System.out.println(result);
            } else {
                result += '1';
                System.out.println(result);
            }
        }
    }

    public static void T3(int number) {
        String result = "";
        String star = "";
        for (int index = 1; index <= number; index++) {
            star += '*';
            result += index;
            System.out.println(result + star);
        }
    }

    public static void T4(int number) {
        String pattern = "";
        for (int i = 1; i <= number; i++) {
            pattern += i;
            System.out.println(pattern);
        }
        if (pattern.length() == number) {
            int num = number;
            for (int i = 1; i <= number; i++) {
                String pattern1 = "";
                for (int j = 1; j <= num; j++) {
                    pattern1 += j;
                }
                num--;
                System.out.println(pattern1);
            }
        }
    }

    public static void T5(int number) {
        String result = "";
        int num = number;
        for (int index = 1; index <= number; index++) {
            result += num;
            System.out.println(result);
            num = num - 1;
        }
    }

    public static void T6(int number) {
        String pattern = "";
        for (int index = 1; index <= number; index++) {
            pattern = index + pattern;
            System.out.println(pattern);
        }
    }

    public static void T7(int number) {
        for (int i = 1; i <= number; i++) {
            String pattern = "";
            for (int j = 1; j <= i; j++) {
                pattern += i;
            }
            System.out.println(pattern);
        }
    }

    public static void T8(int number) {
        String pattern = "";
        for (int index = 1; index <= number; index++) {
            if (index == 1) {
                pattern = pattern + index;
                System.out.println(pattern);

            } else {
                pattern = index + pattern + index;
                System.out.println(pattern);
            }
        }
    }

    public static void T9(int number) {
        int num = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void T10(int number) {
        int num = number;
        for (int i = 1; i <= number; i++) {
            String pattern = "";
            for (int j = 1; j <= num; j++) {
                pattern += j;
            }
            num--;
            System.out.println(pattern);
        }
    }

    public static void T11(int number) {
        int tempNum = 1;
        int num = number;
        for (int i = 1; i <= number; i++) {
            String pattern = "";
            for (int j = num; j >= tempNum; j--) {
                pattern += j;
            }
            tempNum++;
            System.out.println(pattern);
        }
    }

    public static void T12(int number) {
        for (int index = 1; index <= number; index++) {
            if (index % 2 == 0) {
                System.out.println("01010");
            } else {
                System.out.println("10101");
            }
        }
    }

    public static void T13(int number) {
        String result = "";
        int num = number;
        for (int index = 1; index <= number; index++) {
            if (number == num) {
                result += num;
                System.out.println(result);
                num = num - 1;
            } else {
                result = num + result + num;
                System.out.println(result);
                num = num - 1;
            }
        }
    }

    public static void T14(int number) {
        for (int index = 1; index <= number; index++) {
            String result = "";
            if (index == 1) {
                for (int i = 1; i <= index; i++) {
                    result += 'A';
                }
                System.out.println(result);
            } else if (index == 2) {
                for (int i = 1; i <= index; i++) {
                    result += 'B';
                }
                System.out.println(result);
            } else if (index == 3) {
                for (int i = 1; i <= index; i++) {
                    result += 'C';
                }
                System.out.println(result);
            } else if (index == 4) {
                for (int i = 1; i <= index; i++) {
                    result += 'D';
                }
                System.out.println(result);
            } else if (index == 5) {
                for (int i = 1; i <= index; i++) {
                    result += 'E';
                }
                System.out.println(result);
            } else if (index == 6) {
                for (int i = 1; i <= index; i++) {
                    result += 'F';
                }
                System.out.println(result);
            } else if (index == 7) {
                for (int i = 1; i <= index; i++) {
                    result += 'G';
                }
                System.out.println(result);
            } else if (index == 8) {
                for (int i = 1; i <= index; i++) {
                    result += 'H';
                }
                System.out.println(result);
            } else if (index == 9) {
                for (int i = 1; i <= index; i++) {
                    result += 'I';
                }
                System.out.println(result);
            } else if (index == 10) {
                for (int i = 1; i <= index; i++) {
                    result += 'J';
                }
                System.out.println(result);
            } else if (index == 11) {
                for (int i = 1; i <= index; i++) {
                    result += 'K';
                }
                System.out.println(result);
            } else if (index == 12) {
                for (int i = 1; i <= index; i++) {
                    result += 'L';
                }
                System.out.println(result);
            } else if (index == 13) {
                for (int i = 1; i <= index; i++) {
                    result += 'M';
                }
                System.out.println(result);
            } else if (index == 14) {
                for (int i = 1; i <= index; i++) {
                    result += 'N';
                }
                System.out.println(result);
            } else if (index == 15) {
                for (int i = 1; i <= index; i++) {
                    result += 'O';
                }
                System.out.println(result);
            } else if (index == 16) {
                for (int i = 1; i <= index; i++) {
                    result += 'P';
                }
                System.out.println(result);
            } else if (index == 17) {
                for (int i = 1; i <= index; i++) {
                    result += 'Q';
                }
                System.out.println(result);
            } else if (index == 18) {
                for (int i = 1; i <= index; i++) {
                    result += 'R';
                }
                System.out.println(result);
            } else if (index == 19) {
                for (int i = 1; i <= index; i++) {
                    result += 'S';
                }
                System.out.println(result);
            } else if (index == 20) {
                for (int i = 1; i <= index; i++) {
                    result += 'S';
                }
                System.out.println(result);
            } else if (index == 21) {
                for (int i = 1; i <= index; i++) {
                    result += 'T';
                }
                System.out.println(result);
            } else if (index == 22) {
                for (int i = 1; i <= index; i++) {
                    result += 'U';
                }
                System.out.println(result);
            } else if (index == 23) {
                for (int i = 1; i <= index; i++) {
                    result += 'V';
                }
                System.out.println(result);
            } else if (index == 24) {
                for (int i = 1; i <= index; i++) {
                    result += 'W';
                }
                System.out.println(result);
            } else if (index == 24) {
                for (int i = 1; i <= index; i++) {
                    result += 'X';
                }
                System.out.println(result);
            } else if (index == 25) {
                for (int i = 1; i <= index; i++) {
                    result += 'Y';
                }
                System.out.println(result);
            } else if (index == 26) {
                for (int i = 1; i <= index; i++) {
                    result += 'C';
                }
                System.out.println(result);
            }
        }
    }

    public static void T15(int number) {
        String pettern = "";
        for (int index = 1; index <= number; index++) {
            String result = "";
            if (index == 1) {
                System.out.println(index);
            } else if (index == 2) {
                result += index + 1;
                System.out.println(index + result + index);
            } else if (index == 3) {
                result += index + 1;
                int tempNum = index + 2;
                System.out.println(index + result + tempNum + result + index);
            } else if (index == 4) {
                result += index - 1;
                int tempNum = index - 2;
                pettern = index + result + tempNum + 1 + tempNum + result + index;
                System.out.println(pettern);
            } else if (index == 5) {
                System.out.println(index + pettern + index);
            }
        }
    }
}
