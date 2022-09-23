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
        Browser browser = new Browser("leetcode.com");
        browser.visit("google.com");
        browser.visit("facebook.com");
        browser.visit("youtube.com");
        System.out.println(browser.back(1));
        System.out.println(browser.back(1));
        System.out.println(browser.forward(1));
        browser.visit("linkedin.com");
        System.out.println(browser.forward(2));
        System.out.println(browser.back(2));
        System.out.println(browser.back(7));
    }
}
