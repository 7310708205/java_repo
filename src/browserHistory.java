class Browser{
    String[] history = new String[5000];
    int cur = -1;
    int back = -1;

    public Browser(String homepage) {

        visit(homepage);
    }
    public void visit(String url) {
        cur = cur + 1;
        history[cur] = url;
        back = cur;
    }

    public String back(int steps) {
        cur = Math.max(cur - steps, 0);
        return history[cur];
    }

    public String forward(int steps) {
        cur = Math.min(cur + steps, back);
        return history[cur];
    }

}

public class browserHistory {
    public static void main(String[] args) {
//        Browser obj = new Browser(homepage);
//        obj.visit(url);
//        String s1 = obj.back(steps);
//        String s2 = obj.forward(steps);
    }
}
