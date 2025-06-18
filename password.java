import java.util.*;
public class password {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Choose how long you want your password!: ");
        int UserPassLength = UserInput.nextInt();
        if (UserPassLength < 4) {
            System.out.println("the password cannot be lower than 4 !.");
            return;
        }
        String AllUpperLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String AllLowerLetters = AllUpperLetters.toLowerCase();
        String AllNumbers = "0123456789";
        String CommonSymbols = "!@#$%^&*";
        String AllOfThemPutTogether = AllUpperLetters +
                AllLowerLetters + AllNumbers + CommonSymbols;

        char FirstCharacter = AllUpperLetters.charAt((int)(Math.random() *
                AllUpperLetters.length()));

        char SecondCharacter = AllLowerLetters.charAt((int)(Math.random() *
                AllLowerLetters.length()));

        char ThirdCharacter = AllNumbers.charAt((int)(Math.random() *
                AllNumbers.length()));

        char FourthCharacter = CommonSymbols.charAt((int)(Math.random() *
                CommonSymbols.length()));

        String TheRestOfThePassword = "";
        for(int i = 0; i < UserPassLength - 4; i++) {
            int position = (int)(Math.random() * AllOfThemPutTogether.length());
            TheRestOfThePassword += AllOfThemPutTogether.charAt(position);
        }
        String AllPositions = "" + FirstCharacter +
                SecondCharacter + ThirdCharacter +
                FourthCharacter + TheRestOfThePassword;

        String MixingThePassword = "";
        String TemporaryPlaceHolder = AllPositions;
        while(!TemporaryPlaceHolder.isEmpty()) {
            int pos = (int)(Math.random()
                    * TemporaryPlaceHolder.length());

            MixingThePassword += TemporaryPlaceHolder.charAt(pos);

            TemporaryPlaceHolder =
                    TemporaryPlaceHolder.substring(0, pos)
                            + TemporaryPlaceHolder.substring(pos + 1);
        }

        System.out.println("Your Unique Password!: " + MixingThePassword);
    }
}