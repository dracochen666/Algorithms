public class AddBinary {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "1";
//        System.out.println(2%2);
//        System.out.println(1%2);
//        System.out.println(0%2);
        System.out.println(addBinary(num1,num2));
    }
    public static String addBinary1(String a, String b) { //超时
        String result = "";
        int carry = 0;
        int limit = (a.length() > b.length()) ? a.length() : b.length();
        for (int i = limit - 1;i >= 0;i++){
            if (a.length() > b.length()) {
                b = "0" + b;
                i = limit - 1 - b.length();
            }
            if (a.length() < b.length()) {
                a = "0" + a;
                i = limit - 1 - a.length();
            }
        }
        for (int i = limit - 1;i >= 0;i--) {
            if (i > a.length() - 1) {
                result = b.charAt(i) + result;
            }else if (i > b.length() - 1) {
                result = a.charAt(i) + result;
            }else {
                if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                    if (carry == 1) {
                        result = '1' + result;
                        carry = 0;
                    }else {
                        result = '0' + result;
                    }

                }
                if (a.charAt(i) == '1' && b.charAt(i) == '0') {
                    if (carry == 1) {
                        result = '0' + result;
                        carry = 1;
                    }else {
                        result = '1' + result;
                    }

                }
                if (a.charAt(i) == '0' && b.charAt(i) == '1') {
                    if (carry == 1) {
                        result = '0' + result;
                        carry = 1;
                    }else {
                        result = '1' + result;
                    }

                }
                if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                    if (carry == 1) {
                        result = '1' + result;
                        carry = 0;
                    }else {
                        result = '0' + result;
                        carry = 1;
                    }
                }
            }
            if (i == 0 && carry == 1) {
                result = "1"+result;
            }

        }

        return result;
    }
    public static String addBinary(String a, String b) { //错误
        StringBuffer result = new StringBuffer();
        int carry = 0;
        int limit = Math.max(a.length(),b.length());

        for (int i = 0;i < limit;i++){//由于输入的a和b是String类型不方便做运算，因此使用carry存储进位和临时结果
            if (i > a.length()) {
                carry += b.charAt(b.length() - 1 - i) - '0';
            }else if (i > b.length()) {
                carry += a.charAt(a.length() - 1 - i) - '0';
            }else {
                carry += (a.charAt(a.length() - 1 - i) + b.charAt(b.length() - 1 - i) )- '0';
            }
            result.append((char) carry % 2 + '0');
            carry = carry/2;//计算进位
        }
        if (carry > 0) {
            result.append("1");
        }
        result.reverse();
        return result.toString();
    }

    public static String addBinary2(String a, String b) {
        StringBuffer ans = new StringBuffer();
        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2));
            carry /= 2;
        }

        if (carry > 0) {
            ans.append('1' + '0');
        }
        ans.reverse();

        return ans.toString();
    }

}
