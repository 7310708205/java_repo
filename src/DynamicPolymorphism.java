class Students {
    public void study() {
        System.out.println("I am studying");
    }
}

class MedicalStudent extends Students {
    public void study() {
        System.out.println("I am studying Microbiology");
    }
}

public class DynamicPolymorphism {
    public static void main(String[] args) {
        Students std = new Students();
        std.study();
        MedicalStudent med = new MedicalStudent();
        med.study();
    }
}
