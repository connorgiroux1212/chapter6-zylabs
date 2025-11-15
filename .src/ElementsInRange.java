import java.util.Scanner;

public class ElementsInRange {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] userVals = new int[20];
        int numVals = input.nextInt();
        for (int i = 0; i < numVals; i++) {
            userVals[i] = input.nextInt();
        }
        int lowerBound = input.nextInt();
        int upperBound = input.nextInt();

        for (int i = 0; i < numVals; i++) {
            if (userVals[i] >= lowerBound && userVals[i] <= upperBound) {
                System.out.print(userVals[i] + " ");
            }
        }
        System.out.println();
    }
}
