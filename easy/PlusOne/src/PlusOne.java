public class PlusOne {
    public static void main(String[] args) {
        int[] num = {9};
        num = plusOne(num);
        System.out.println(num[0]);
        System.out.println(num[1]);
//        System.out.println(num[2]);
    }
    public static int[] plusOne(int[] digits) {//使用carry记录进位 //0ms
//        digits[digits.length - 1] += 1;
        int carry = 0;
        for (int i = digits.length - 1;i >= 0;i --) {
            if (i == digits.length - 1) {
                digits[i] = digits[i] + 1;
            }else {
                digits[i] = digits[i] + carry;
                carry = 0;
            }
            if (digits[i] == 10) {
                carry = 1;
                digits[i] = 0;
            }
            if (carry == 0) {
                break;
            }
            if (i == 0 && carry == 1) {
                int[] temp = new int[digits.length + 1];
                temp[0] = 1;
                return temp;
            }
        }
        return digits;
    }

    public static int[] plusOne1(int[] digits) {//通过判断末尾加一会不会产生进位 //0ms
        for (int i = digits.length - 1;i >= 0;i --) {
            if (digits[i] != 9) {//循环终止与当前值不为9时，也就是不会产生进位时。
                digits[i] += 1;
                return digits;
            }
            //当前值为9，也就是会产生进位，因此当前值置为0并继续循环
            digits[i] = 0;
        }
        //如果运行到这里说明digits中首位产生了进位（例：99999+1）,需要扩充。
        int[] extend = new int[digits.length + 1];
        extend[0] = 1;
        return extend;
    }

}
