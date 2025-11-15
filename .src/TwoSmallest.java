import java.util.Scanner;

public class TwoSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] userVals = new int[20];
        int numVals = input.nextInt();

        for (int i = 0; i < numVals; i++) {
            userVals[i] = input.nextInt();
        }
        int smallestVal;
        int nextSmallestVal;

        if (userVals[0] < userVals[1]) {
            smallestVal = userVals[0];
            nextSmallestVal = userVals[1];
        } else {
            smallestVal = userVals[1];
            nextSmallestVal = userVals[0];
        }

        for (int i = 2; i < numVals; i++) {
            int tempVal = userVals[i];

            if (tempVal < nextSmallestVal && (tempVal != smallestVal)) {
                nextSmallestVal = tempVal;
            }
            if (tempVal < smallestVal) {
                nextSmallestVal = smallestVal;
                smallestVal = tempVal;
            }
        }
        System.out.println(smallestVal + " " + nextSmallestVal);
    }
}
