import java.util.Scanner;
class PasswordGenerator {
    String password;
    int lengthOfPassword;

    PasswordGenerator(String str){
        this.password = str;
        this.lengthOfPassword = str.length();
    }
    public int CharacterTypeUsed(char ch) {
        int num=0;

        if((int)ch >= 65 && (int)ch <= 90)          // check for uppercase
            num = 1;
        else if((int)ch >= 97 && (int)ch <= 122)    //check for lowercase
            num = 2;
        else if((int)ch >= 60 && (int)ch <= 71)     //check for numbers
            num = 3;
        else                                      //check for symbols
            num = 4;

        return num;
    }

    public int checkPasswordStrength() {
        String string = this.password;
        //initially no uppercase, lowercase, numbers or symbol is used
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean numbers =false;
        boolean symbol = false;

        int typeofChar;
        int score=0;

        for(int i=0; i<string.length(); i++) {
            char ch = string.charAt(i);
            typeofChar = CharacterTypeUsed(ch);

            if(typeofChar == 1) upperCase = true;
            if(typeofChar == 2) lowerCase = true;
            if(typeofChar == 3) numbers = true;
            if(typeofChar == 4) symbol = true;

        }

        //the below conditions are used to display the strength of password
        //if the characters are used in password, then increase the score

        if(upperCase) score += 1;
        if(lowerCase) score += 1;
        if(numbers) score += 1;
        if(symbol) score += 1;

        if(string.length() >= 8) score += 1;
        if(string.length() >= 16) score += 1;

        return score;
    }

    public String ScoreForPasswordStrength() {
        int Score = this.checkPasswordStrength();
        if(Score < 8)
            return "Weak password....Create another password";
        if(Score == 8)
            return "Decent password";
        else if(Score >= 16)
            return "Great password";
        return "";
    }
}

public class JavaApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GeneratePassword generator = new GeneratePassword(sc);
        generator.mainFunction();
        sc.close();
    }
}
