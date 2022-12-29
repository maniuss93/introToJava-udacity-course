public class excercise13 {
    public static void main(String[] args) {
        int [] [] grades = {{87, 93, 99, 75, 60},
                            {93, 70, 98, 90, 75},
                            {82, 75, 95, 80, 66},
                            {90, 75, 99, 85, 70}};
        double result = englishAverage(grades);
        System.out.println(result);
    } public static double englishAverage (int [] [] grades) {
        int size = grades[0].length;
        int total = 0;
        for (int i=0; i < size; i++) {
            total += grades [1][i];
        }
        double average = total/ (double) size;
        return average;
    }
}
