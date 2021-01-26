import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = 0;
        int input2 = 0;
        int temp = 0;
        boolean stateChange = false;
        int preState = 0;
        int startState = 0;
        if (scanner.hasNext()) {
            input1 = scanner.nextInt();
        }
        if (scanner.hasNext()) {
            input2 = scanner.nextInt();
            if (input2 == 0) {
                System.out.println(true);
                return;
            } else { //define start state
                preState = input2 - input1 == 0 ? 0 : input2 - input1 > 0 ? 1 : -1;
                if (preState != 0)
                    startState = preState;
            }
        }
        temp = input2;
        while (scanner.hasNext())
        {
            int input3 = scanner.nextInt();
            if (input3 == 0)
            {
                break;
            }
            int currentState = 0;
            if (startState == 0)
            {
                currentState = input3 - temp == 0 ? 0 : input3 - temp > 0 ? 1 : -1;
                if (currentState == 0)
                {
                    temp = input3;
                    continue;
                }
                else
                {
                    startState = currentState;
                    temp = input3;
                    continue;
                }
            }
            else
            {
                currentState = input3 - temp == 0 ? 0 : input3 - temp > 0 ? 1 : -1;
                if (currentState == 0)
                {
                    temp = input3;
                    continue;
                }
                else if (currentState == startState)
                {
                    temp = input3;
                    continue;
                }
                else
                {
                    System.out.println(false);
                    return;
                }
            }
        }

        System.out.println(true);

    }
}