public class extra1 {
    public static void main(String [] args) {
        double number = absoluteValue(-3);
        System.out.println(number);
    }
    public static double absoluteValue(double a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
