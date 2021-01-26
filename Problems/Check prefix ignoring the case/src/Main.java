import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next().toLowerCase();
        boolean in = text.startsWith("j") ? true : false;
        System.out.println(in);
        }
    }
