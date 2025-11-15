import java.util.Scanner;

public class ContainsTheCharacter {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] userWords = new String[20];

        int numWords = input.nextInt();

        for (int i = 0; i < numWords; i++) {
            userWords[i] = input.next();
        }
        char checkChar = input.next().charAt(0);

        for (int i = 0; i < numWords; i++) {
            if (i < numWords) {
                if (userWords[i].contains("" + checkChar)) {
                    System.out.println(userWords[i]);
                }
            }
        }
    }
}
