public class PasswordAlphabet {

    public static final String UpperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    public static final String Numbers = "0123456789";
    public static final String Symbols = "!@#$%^&*~()-/_=+?";

    private final StringBuilder sb;


    public PasswordAlphabet(boolean uppercase, boolean lowercase, boolean numbers, boolean symbols) {

        sb = new StringBuilder();

        if (uppercase) sb.append(UpperCaseLetters);

        if (lowercase) sb.append(LowerCaseLetters);

        if (numbers) sb.append(Numbers);

        if (symbols) sb.append(Symbols);

    }

    public String getPasswordAlphabet() {
        return sb.toString();
    }
}
