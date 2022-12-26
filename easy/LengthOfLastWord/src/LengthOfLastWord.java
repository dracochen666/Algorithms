public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello    World    ";
        System.out.println(lengthOfLastWord(s));
        String[] ss = s.split(" ");


    }
    public static int lengthOfLastWord2(String s) {//0ms
        //"Hello    World    " ---split--> ["Hello", "", "", "", "World"]
        //split的结果不包括两侧的空格
        String[] strArr = s.split(" ");
        //返回split结果最后一个单词的长度
        return strArr[strArr.length - 1].length();
    }
    public static int lengthOfLastWord(String s) {//0ms
        s = s.strip();
        for (int i = s.length() - 1;i >= 0;i --){
            if (s.charAt(i) == ' ') {
                return s.length() - 1 - i;
            }
        }
        return  s.length();
    }
    public static int lengthOfLastWord1(String s) {//5ms
        String result = "";
        int count = 0;
        for(int i = s.length()-1;i >= 0;i--){
            if (s.charAt(i) == ' ') {
                s = s.substring(0,i);
            }else if (s.charAt(i) != ' ') {
                break;
            }
        }
        for(int i = s.length()-1;i >= 0;i--){
            if (s.charAt(i) == ' ') {
                break;
            }else {
                result = s.charAt(i) + result;
            }
        }
        return result.length();
    }
}
