import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();

        for (int i = lower; i <= upper; i++)
            System.out.print(text.charAt(i));

    }
}