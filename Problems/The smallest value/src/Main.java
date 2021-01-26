import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long sum = 1L;
        int i = 1;
        if (number == 0)
        {
            System.out.println(1);
            return;
        }

        while (sum <= number)
        {
            sum *= i;
            i++;
        }
        System.out.println(i-1);
    }
}
