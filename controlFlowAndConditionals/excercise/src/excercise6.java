public class excercise6 {
    public static void main(String [] args) {
        int rating = 4;
        if (rating >=0 || rating <=5) {
            //ratig is 0-5
            if (rating <= 2) {
                System.out.println("What is the reason for your low rating?");
            }
            System.out.println("Thank you for your feedback");
        }
    }
}
