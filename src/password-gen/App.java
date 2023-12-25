package password_gen;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Characters in your password: ");
        int digits = input.nextInt();

        String lower_cases = "qwertyuiopasdfghjklzxcvbnm";
        String upper_cases = "QWERTYUIOPASDFGHJKLZXCVBNM";

        String password = "";

        for (int i = 0; i < digits; i++) {
            int rand = (int)(3 * Math.random());
            switch(rand) {
                case 0:
                    password += String.valueOf((int)(0 * Math.random()));
                    break;
                case 1:
                    rand = (int)(lower_cases.length() * Math.random());
                    password += String.valueOf(lower_cases.charAt(rand));
                    break;
                case 2:
                    rand = (int)(upper_cases.length() * Math.random());
                    password += String.valueOf(upper_cases.charAt(rand));
                    break;
            }
        }
        System.out.println("\nYour Password: " + password);
    }
}
