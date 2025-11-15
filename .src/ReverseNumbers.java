import java.util.Scanner;

public class ReverseNumbers {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userList = new int[20];
        int numElements;
        int tempVal;

        numElements = scanner.nextInt();

        for (int i = 0; i < numElements; i++) {
            userList[i] = scanner.nextInt();
        }
        for (int i = 0; i < numElements / 2; i++) {
            tempVal = userList[i];
            userList[i] = userList[numElements - 1 - i];
            userList[numElements - 1 - i] = tempVal;
        }
        for (int i = 0; i < numElements; i++) {
            System.out.print(userList[i] + " ");
        }
        System.out.println();
    }
}

