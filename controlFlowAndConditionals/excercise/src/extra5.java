public class extra5 {
    public static void main(String[] args) {
        int time = 18;
        String timeOfDay;
        if (time >= 5 && time < 12) {
            timeOfDay = "morning";
        } else if (time >= 12 && time < 20) {
            timeOfDay = "afternoon";
        } else {
            timeOfDay = "night";
        }
        System.out.println(timeOfDay);
    }
}
