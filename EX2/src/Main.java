public class Main {
    public static void main(String[] args) {
        System.out.println(areFriendlyNumbers(220, 284));
    }

    public static boolean areFriendlyNumbers(int num1, int num2) {
        return sumOfDivisors(num1) == num2 && sumOfDivisors(num2) == num1;
    }

    public static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
