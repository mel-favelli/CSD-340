public class Main {
    
}
import java.util.Scanner;

public class SubstringChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        if (string1.contains(string2)) {
            System.out.println("The second string is a substring of the first string.");
        } else if (string2.contains(string1)) {
            System.out.println("The first string is a substring of the second string.");
        } else {
            System.out.println("Neither string is a substring of the other.");
        }

        scanner.close();
    }
}