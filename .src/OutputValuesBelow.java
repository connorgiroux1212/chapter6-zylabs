import java.util.Scanner;

public class OutputValuesBelow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] userValues = new int[20];
        int userNum = input.nextInt();

        for (int i = 0; i < userNum; i++) {
            userValues[i] = input.nextInt();
        }
        int thresh = input.nextInt();

        for (int i = 0; i < userNum; i++) {
            if (userValues[i] <= thresh) {
                System.out.print(userValues[i] + " ");
            }
        }
        System.out.println();
    }
}
