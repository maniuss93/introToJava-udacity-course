public class excercise11 {
    public static void main(String[] args) {
    double [] speed = {7.85, 7.32, 4.9, 6.22, 5.4, 7.3, 5.19};
    double result = search(speed);
        System.out.println(result);
    }
    public static double search(double [] speed) {
        int size = speed.length;
        double min = speed[0];
        for (int i = 1; i < size; i++) {
            if (speed[i] < min) {
                min = speed[i];
            }
        } return min;
    }
}
