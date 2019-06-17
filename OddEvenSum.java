import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;

        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());

            if (i %2 == 0) {
                sumEvenNumbers += numbers;
            } else {
                sumOddNumbers += numbers;
            }
        }

        if (sumEvenNumbers == sumOddNumbers) {
            System.out.printf("Yes%nSum = %d", sumEvenNumbers);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sumEvenNumbers - sumOddNumbers));
        }
    }
}
