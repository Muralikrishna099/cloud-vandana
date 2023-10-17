import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Pangram {
    public static boolean isPangram(String input) {
        input = input.toLowerCase();
        Set<Character> alphabetSet = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }

        return alphabetSet.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (isPangram(inputString)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        
    }
}
