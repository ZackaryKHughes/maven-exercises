import java.util.Scanner;

public class StringUtils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Anything Your Heart Desires: ");
        String input = scanner.nextLine();
        System.out.println("You Entered: \"" + input + "\"");
        if (org.apache.commons.lang3.StringUtils.isNumeric(input)) {
            System.out.println("\"" + input + "\" is a number");
        } else {
            System.out.println("\"" + input + "\" is not a number");
        }
        System.out.println("Flipped Case: " + org.apache.commons.lang3.StringUtils.swapCase(input));
        System.out.println("Reversed: " + org.apache.commons.lang3.StringUtils.reverse(input));
    }
}
