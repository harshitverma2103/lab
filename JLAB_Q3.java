public class JLAB_Q3 {
    public static void main(String[] args) {
        System.out.println(T1("#global#"));
        System.out.println(T1("#1#2#3"));
        System.out.println(T1("####"));
        System.out.println(T1("#C#O#D#E#"));
        System.out.println(T1("*#@@#*"));
        System.out.println(T2("abcd"));
        System.out.println(T2("479"));
        System.out.println(T2("179"));
        System.out.println(T2("2119"));
        System.out.println(T2("1to9"));
    }

    public static String T1(String word) {
        String modifideString = "";
        for(int index = 0; index < word.length(); index++){
            char ch = word.charAt(index);
            if( ch != '#') {
                modifideString += ch;
            }
        }
        return modifideString;
    }

    public static String T2(String str){
        String result = "";
        for(int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            if(ch == '1'){
                result += "ab";
            }
            else if(ch == '9') {
                result += "c";
            }
            else {
                result += ch;
            }
        }
        return result;
    }
}
