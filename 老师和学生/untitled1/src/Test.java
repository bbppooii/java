public class Test {
    public class PerfectNumbers {
        // 检查一个数是否为完全数
        public static boolean isPerfectNumber(int number) {
            int sum = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            return sum == number;
        }

        public static void main(String[] args) {
            System.out.println("完全数列表（1 到 1000）：");
            for (int i = 1; i <= 1000; i++) {
                if (isPerfectNumber(i)) {
                    System.out.println(i);
                }
            }
        }
    }
}