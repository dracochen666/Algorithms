public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        char[] romanChars = s.toCharArray();
//        String[] specialRoman = {"IV","IX","XL","XC","CD","CM"};
        int result = 0;
        for(int i = 0;i < romanChars.length;i++){
            if (romanChars[i] == 'I') {
                if ( i == romanChars.length - 1) {
                    result += 1;
                }else {
                    if (romanChars[i+1] == 'V' ) {
                        result += 4;
                        i += 1;
                    }else if (romanChars[i+1] == 'X' ){
                        result += 9;
                        i += 1;
                    }else {
                        result += 1;
                    }

                }

            }else if (romanChars[i] == 'V') {
                result += 5;
            }else if (romanChars[i] == 'X') {
                if ( i == romanChars.length - 1) {
                    result += 10;
                }else {
                    if (romanChars[i+1] == 'L' ) {
                        result += 40;
                        i += 1;
                    }else if (romanChars[i+1] == 'C' ){
                        result += 90;
                        i += 1;
                    }else {
                        result += 10;
                    }
                }
            }else if (romanChars[i] == 'L') {
                result += 50;
            }else if (romanChars[i] == 'C') {
                if ( i == romanChars.length - 1) {
                    result += 100;
                }else {
                    if (romanChars[i+1] == 'D' ) {
                        result += 400;
                        i += 1;
                    }else if (romanChars[i+1] == 'M' ){
                        result += 900;
                        i += 1;
                    }else {
                        result += 100;
                    }
                }
            }else if (romanChars[i] == 'D') {
                result += 500;
            }else if (romanChars[i] == 'M') {
                result += 1000;
            }else {
                System.out.println("识别错误!");
                result = -1;
            }
        }
        return result;
    }
}
