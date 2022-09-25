import java.util.Scanner;
public class GeneratePassword {

    PasswordAlphabet alphabet;
    public static Scanner key;

    public GeneratePassword(Scanner scanner) {
        key = scanner;
    }

    public GeneratePassword(boolean IncludeUpper, boolean IncludeLower, boolean IncludeNum, boolean IncludeSym) {
        alphabet = new PasswordAlphabet(IncludeUpper, IncludeLower, IncludeNum, IncludeSym);
    }


    public void mainFunction() {
        System.out.println("Generate your password here..)");
        printMenu();

        String Choice = "-1";

        while (!Choice.equals("4")) {

            Choice = key.next();

            switch (Choice) {
                case "1" : {
                    requestPassword();
                    printMenu();
                }
                case "2" : {
                    checkPassword();
                    printMenu();
                }
                case "3" : {
                    UserInformation();
                    printMenu();
                }
                case "4" : printQuit();
                default : {
                    System.out.println();
                    System.out.println("Please select one option");
                    printMenu();
                }
            }
        }
    }

    private PasswordGenerator CreatePassword(int length) {
        final StringBuilder pass = new StringBuilder();

        final int alphabetLength = alphabet.getPasswordAlphabet().length();

        int minLen = 0;
        int maxLen = alphabetLength - 1;
        int range = maxLen - minLen + 1;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * range) + minLen;
            pass.append(alphabet.getPasswordAlphabet().charAt(index));
        }

        return new PasswordGenerator(pass.toString());
    }

    private void requestPassword() {
        boolean UpperChar = false;
        boolean LowerChar = false;
        boolean Number = false;
        boolean Symbol = false;

        boolean condition = false;

        System.out.println("Answer the questions in Yes or No...");

        do {
            System.out.println("Do you want to use Lowercase letters");
            String str = key.nextLine();

            if (isInclude(str)) LowerChar = true;

            System.out.println("Do you want to use Uppercase letters");
            str = key.nextLine();

            if (isInclude(str)) UpperChar = true;

            System.out.println("Do you want Numbers");
            str = key.nextLine();

            if (isInclude(str)) Number = true;

            System.out.println("Do you want Symbols");
            str = key.nextLine();

            if (isInclude(str)) Symbol = true;

            if (!UpperChar && !LowerChar && !Number && !Symbol) {
                System.out.println("You have not selected any character to generate your password. Enter one character");
                condition = true;
            }

            System.out.println("Awesome! Enter the length of the password ");
            int length = key.nextInt();

            final GeneratePassword generatePassword = new GeneratePassword(UpperChar, LowerChar, Number, Symbol);
            final PasswordGenerator password = generatePassword.CreatePassword(length);

            System.err.println("Your have generated the password -> " + password);

        } while (condition);
    }

    private void printMenu() {
        System.out.println("Enter 1 for Password Generator");
        System.out.println("Enter 2 for Checking Password Strength");
        System.out.println("Enter 3 for Useful Information");
        System.out.println("Enter 4 to Exit");
        System.out.print("Enter your Choice:");
    }


    public void UserInformation() {
        System.out.println("Avoid using same password twice");
        System.out.println("Avoid  use repetitive characters, dictionary words, keyboard patterns & number sequences");
        System.out.println("Try to create a password that includes uppercase,lowercase, numbers and symbols");
        System.out.println("Keep the length of password more than 8 or 16");
    }


    private boolean isInclude(String string) {
        if (string.equalsIgnoreCase("Yes")) {
            return true;
        }
        else {
            if (!string.equalsIgnoreCase("No")) {
                PasswordError();
            }
            return false;
        }
    }

    private void PasswordError() {
        System.out.println("You have entered incorrect password....");
    }

    private void checkPassword() {
        String str;
        final Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter your password:");
        str = sc.nextLine();

        final PasswordGenerator pw = new PasswordGenerator(str);

        System.out.println(pw.ScoreForPasswordStrength());

        sc.close();
    }

    private void printQuit() {
        System.out.println("Out of program...");
    }
}
