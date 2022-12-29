public class extra3 {
    public static void main(String[] args) {
    int result = yearsTilOneMillion(500);
        System.out.println(result);
    }
    public static int yearsTilOneMillion(double initialBalance) {
        int years = 0;
        double balance = initialBalance;
        while (balance < 1000000) {
            years = years + 1;
            balance = balance * 1.05;
        } return years;
    }
}
