public class MySqrt {
    public static void main(String[] args) {
    System.out.println(mySqrt(16));
    }
    public static int mySqrt(int x) {//二分
        int left = 0;
        int right = x;
        int result = -1;
        if (x == 0) return 0;
        while (left <= right) {
            int mid = (right - left)/2 + left; //算出左右边界差值的1/2 在加上左边界就是两边界中点坐标
            if ((long)mid * mid <= x) {
                result = mid;
                left = mid + 1;
            }else {
                right = mid - 1;

            }

        }
        return result;
    }
    public static int mySqrt1(int x) {
        // 由于计算机无法存储浮点数的精确值
        // 而指数函数和对数函数的参数和返回值均为浮点数，因此运算过程中会存在误差。
        // 例如当 x = 2147395600时，
        int result = (int) Math.exp(0.5 * Math.log(x));
        return (long) (result + 1) * (result + 1) <= x ? result + 1 : result;
    }
}
