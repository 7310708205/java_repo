
class Library <T> {
    T type;
    String name;

    public void Library(T type, String name) {
        this.type = type;
        this.name = name;
    }

    public void printMedia() {
        if(type == "String") {
            System.out.println("Book name is "+name);
        }
        else if(type.equals(1)){
            System.out.println("Video name is "+name);
        }
        else {
            System.out.println("Newspaper name is "+name);
        }
    }
}

public class LibraryGenerics {
    public static void main(String[] args) {
        Library<String> type1 = new Library<>();
        type1.Library("String", "The Arts of Happiness");
        Library<Integer> type2 = new Library<>();
        type2.Library(5, "Java Tutorial");
        Library<Double> type3 = new Library<>();
        type3.Library(4.5, "Times of India");
        type1.printMedia();
        type2.printMedia();
        type3.printMedia();

    }
}
