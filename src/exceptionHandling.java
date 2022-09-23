import java.util.Scanner;

public class exceptionHandling {
    static void validate (int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("age is not valid to vote");
        }
        else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String args[])
    {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        try
        {
            validate(age);
        }
        catch (InvalidAgeException e)
        {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
        finally {
            System.out.println("finally block is executed");
        }
    }
}

class InvalidAgeException  extends Exception
{
    public InvalidAgeException (String str)
    {
        super(str);
    }
}