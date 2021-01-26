import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (;;)
        {
            int input = scanner.nextInt();
            if (input == 0)
                break;
            else
            {
                sum = sum + input;
                if (sum >= 1000) {
                    sum = sum - 1_000;
                    break;
                }
            }
        }
        System.out.printf("%d",sum);
    }
}
