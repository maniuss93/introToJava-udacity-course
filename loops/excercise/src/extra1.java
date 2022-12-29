public class extra1 {
    public static void main(String[] args) {
    int result = factorial (5);
        System.out.println(result);
    }
    public static int factorial(int n) {
        int total = 1;
        for(int i=1; i <= n; i++) {
            total *= i;
        } return total;
    }
}
