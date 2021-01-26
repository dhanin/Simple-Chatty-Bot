import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        boolean yes = string.endsWith("burg") ? true : false;
        System.out.println(yes);
    }
}