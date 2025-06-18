import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prime;
        boolean isprime;
        for (;;) {
            System.out.print("inter prime num: ");
            prime = scanner.nextInt();
            isprime = true;
            if (prime <= 1) {
                isprime = false;
            } else {
                for (int i = 2; i <= prime / 2; i++) {
                    if (prime % i == 0) {
                        isprime = false;
                        break;
                    }
                }
            }
            if (isprime) {
                System.out.println(prime + ": is a prime ");
                break;
            } else {
                System.out.println(prime + " is not a prime, do again");
       }
}
    }
}
