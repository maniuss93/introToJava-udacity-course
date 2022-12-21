public class extra2 {
    public static void main(String [] args) {
        double value = calculateTip(24);
        System.out.println(value);
    }
    public static double calculateTip(double mealCost) {
        return mealCost *15 /100;
    }
}
