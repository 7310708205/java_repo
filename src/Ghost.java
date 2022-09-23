import java.util.Random;
public class Ghost {
    final String[] colors = { "white", "yellow", "purple", "red" };
    public String getColor() {
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }

    public static void main(String[] args) {

        Ghost ghost = new Ghost();
        System.out.println(ghost.getColor());
    }
}
