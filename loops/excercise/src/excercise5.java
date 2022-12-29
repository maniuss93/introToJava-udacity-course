public class excercise5 {
    public static void main(String[] args) {
    int sum = addNumber();
        System.out.println(sum);
    }
    public static int addNumber() {
        int sum = 0;
        for (int i = 15; i <= 20; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
