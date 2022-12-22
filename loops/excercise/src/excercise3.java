public class excercise3 {
    public static void main(String [] args) {
        raiseAlarm(25);
    }
    public static void raiseAlarm(int numberOfWarnings) {
        int i = 1;
        while (i <= numberOfWarnings) {
            System.out.println("Warning");
            i++;
            }
    }
}
