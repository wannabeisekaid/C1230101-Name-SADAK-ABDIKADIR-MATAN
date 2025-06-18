import java.util.Scanner;
public class SENTINAL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int adding = 0;
        while (true) {
            System.out.print("Enter a number (or N to stop): ");
            String enter = input.next();
            if (enter.equalsIgnoreCase("N")) {
                break;
            }
            int num = Integer.parseInt(enter);
            adding += num;
        }

        System.out.println("Total sum is: " + adding);
    }
}
