public class excercise4 {
    public static void main(String [] args) {
    int degreC = 32;
    weatherInterpreter(degreC);
    }
    public static void weatherInterpreter(int temperature) {
        if (temperature > 30) {
            System.out.println("It's hot outside");
        } else if (temperature < 5) {
            System.out.println("It's cold outside");
        } else {
            System.out.println("Not too hot not too cold");
        }
    }
}
