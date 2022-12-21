public class excercise4 {
    public static void main(String [] args) {
        int ticketPrice = 10;
        int age = 30;
        boolean isStudent = true;
        if (age <= 15) {
            ticketPrice = 5;
        } else if (age > 60) {
            ticketPrice = 5;
        } else if (isStudent) {
            ticketPrice = 5;
        }
        System.out.println("Your ticket price is $"+ticketPrice);
    }
}




