public class NameMe {

    private String firstName;
    private String lastName;

    NameMe(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        NameMe name = new NameMe("John", "Doe");
        System.out.println(name.firstName);
        System.out.println(name.lastName);
    }
}
