public class excercise10 {
    public static void main(String[] args) {
    double [] temperatures = {75, 73, 72, 80};
    double result = calculateAverage(temperatures);
        System.out.println(result);
    }
    public static double calculateAverage(double [] temperatures) {
        int size = temperatures.length;
        double total = 0;
        for (int i=0; i < size; i++){
            total += temperatures[i];
        } double average = total/size;
        return average;
    }
}
