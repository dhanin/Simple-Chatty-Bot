import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine().trim();
        String string2 = scanner.nextLine().trim();
        String text1 = string1.replaceAll("\\s+", "");
        String text2 = string2.replaceAll("\\s+", "");

        boolean yes = text1.equals(text2) ? true : false;

        System.out.println(yes);

    }
}
