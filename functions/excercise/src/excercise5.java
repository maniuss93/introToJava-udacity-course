public class excercise5 {
    public static void main(String [] args) {
        printPhoto(30, 60, true);
    }
    public static void printPhoto(int width, int height, boolean inColor) {
        System.out.println("Width = "+ width +"cm");
        System.out.println("Height = " +height +"cm");
        if (inColor) {
            System.out.println("Print is full color");
        } else {
            System.out.println("Print is black and white");
        }
    }
}
