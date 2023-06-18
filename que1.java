public class Main {
    public static int Sqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int left = 1;
        int right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int x1 = 4;
        int x2 = 8;

        System.out.println("Square root of " + x1 + ": " + Sqrt(x1));
        System.out.println("Square root of " + x2 + ": " + Sqrt(x2));
    }
}