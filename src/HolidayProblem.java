class Holiday {
    public String name;
    public int day;
    public String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday holiday) {
        return (month.equals(holiday.month));

    }

    public static double avgDate(Holiday[] holiday) {
        int sum = 0;

        for (int i = 0; i < holiday.length; i++) {
            sum = sum + holiday[i].day;
        }
        return ((double) sum) / holiday.length;
    }

    public static void main(String[] args) {
        Holiday h1 = new Holiday("Independence Day ", 4, "July");
        Holiday h2 = new Holiday("Republic Day ", 5, "January");
        boolean monthCheck = h1.inSameMonth(h2);
        Holiday[] dates = new Holiday[2];
        dates[0] = h1;
        dates[1] = h2;
        for (Holiday i : dates)
            System.out.println(i.name + i.day + " " + i.month);
        double avg = avgDate(dates);
        System.out.println(avg);
        System.out.println(monthCheck);
    }
}
