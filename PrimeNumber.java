import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int PrimeNumber;
        boolean IsPrimeNumber;
        for (;;) {
            System.out.print("inter prime num: ");
            PrimeNumber = scanner.nextInt();
            IsPrimeNumber = true;
            if (PrimeNumber <= 1) {
                IsPrimeNumber = false;
            } else {
                for (int i = 2; i <= PrimeNumber / 2; i++) {
                    if (PrimeNumber % i == 0) {
                        IsPrimeNumber = false;
                        break;
                    }
                }
            }
            if (IsPrimeNumber) {
                System.out.println(PrimeNumber + ": is a prime number");
                break;
            } else {
                System.out.println(PrimeNumber + " is not a prime number, enter a new number");
       }
}
    }
}
