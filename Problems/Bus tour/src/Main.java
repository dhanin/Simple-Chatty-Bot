import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int numBridges = scanner.nextInt();
        for (int i = 0; i < numBridges; i++)
        {
            int input = scanner.nextInt();
            if (height >= input)
            {
                System.out.printf("Will crash on bridge %d" , i+1);
                return;
            }
        }
        System.out.println("Will not crash");
    }
}