import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enter;

        for (;;) {
            System.out.print("enter a letter: ");
            enter = scanner.nextLine();

            boolean NotApalendrom = true;
            int lenhgt = enter.length();

            for (int item = 0; item < lenhgt / 2; item++) {
                if (enter.charAt(item) != enter.charAt(lenhgt - item - 1)) {
                    NotApalendrom = false;
                    break;
                }
            }

            if (NotApalendrom) {
                System.out.println(enter + " : is a palindrome");
                break;
       }
}
    }
}
