import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String test = "abcabcbb";
        int num = lengthOfLongestSubstring2(test);
        System.out.println(num);
    }
    public static int lengthOfLongestSubstring(String s) {
        ArrayList<Character> subChars = new ArrayList<>();
        int maxCount = 0;
        int currentCount = 0;
        char[] chars = s.toCharArray();
        for(int i = 0;i < chars.length;i++){
            if (subChars.size() == 0){
                subChars.add(chars[i]);
                currentCount++;
            }else {
                if (subChars.contains(chars[i])) {
                    maxCount = (maxCount > currentCount) ? maxCount : currentCount;
                    subChars = new ArrayList<>();
                    i = i - currentCount;
                    currentCount = 0;
                }else {
                    subChars.add(chars[i]);
                    currentCount++;
                }
            }
        }
        maxCount = (maxCount > currentCount) ? maxCount : currentCount;
        return maxCount;
    }

    public static int lengthOfLongestSubstring2(String s) {
        //ab
        if (s.length()<=1) return s.length();
        HashSet<Character> set = new HashSet<>();
        int startIndex = 0;
        int endIndex = 0;
        int maxCount = 0;
        while (endIndex < s.length()) {
            while (set.contains(s.charAt(endIndex))) {
                set.remove(s.charAt(startIndex));
                startIndex ++;
            }
            maxCount = Math.max(maxCount,(endIndex - startIndex + 1));
            set.add(s.charAt(endIndex));
            endIndex ++;
        }
        return maxCount;
    }
}
