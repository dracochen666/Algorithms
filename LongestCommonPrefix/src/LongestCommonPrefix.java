public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
    public static String longestCommonPrefix(String[] strs) {
        //窗口
        String currentPrefix = "";
        boolean flag = false;
        for (int i = 0;i < strs[0].length();i++){
            currentPrefix = strs[0].substring(0,i+1);
            for(int j = 0;j < strs.length;j++){
                if (strs[j].startsWith(currentPrefix)){
                    continue;
                }else {
                    currentPrefix = currentPrefix.substring(0,currentPrefix.length() - 1);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return currentPrefix;
    }
}
