public class extra7 {
    public static void main(String [] args) {
        int dayOfWeek = 3;
    /*  1 = Monday
        2 = Tuesday
        3 = Wednesday
        4 = Thursday
        5 = Friday
        6 = Saturday
        7 = Sunday */
        String schedule;
        switch(dayOfWeek) {
            case 1: schedule = "Gym in the morning.";
                break;
            case 2: schedule = "Class after work";
                break;
            case 3: schedule = "Meetings all day";
                break;
            case 4: schedule = "Work from home.";
                break;
            case 5: schedule = "Game night after work.";
                break;
            case 6: case 7: default: schedule = "Free!";
                break;
        } System.out.println(schedule);
    }
}
