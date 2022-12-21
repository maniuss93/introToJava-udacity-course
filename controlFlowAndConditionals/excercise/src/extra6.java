public class extra6 {
    public static void main(String [] args) {
        boolean holiday = false;
        int weekday = 5;
    /*  1 = Monday
        2 = Tuesday
        3 = Wednesday
        4 = Thursday
        5 = Friday
        6 = Saturday
        7 = Sunday */
        if (weekday >=1 && weekday <=5 && !holiday) {
            System.out.println("Wake up at 7.00");
        } else {
            System.out.println("Sleep in");
        }

    }
}
