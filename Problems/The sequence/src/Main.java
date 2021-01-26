import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        int count = 1;
        while (count <= number)
        {
            for (int j = 0; j < i; j++)
            {
                if (j == i || count > number)
                {
                    break;
                }
                else
                {
                    System.out.print(i + " ");
                    count++;
                }

            }
            i++;
        }

    }
}