import java.util.Arrays;
import java.util.Scanner;

public class MiddleItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userValues = new int[9];
        int inputCounter = 0;
        int userVal;

        for (int i = 0; i < 10; i++) {
            userVal = scanner.nextInt();
            if (userVal < 0) {
                break;
            }
            ++inputCounter;
            if (inputCounter > 9) {
                System.out.println("Too many inputs");
                break;
            }
            userValues[i] = userVal;
        }
        if (inputCounter <= 9) {
            System.out.println(userValues[inputCounter / 2]);
        }
    }
}