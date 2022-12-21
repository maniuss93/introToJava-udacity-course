public class excercise7 {
    public static void main(String [] args) {
        double change = makeChange(16.7,25);
        System.out.println(change);
    }
    public static double makeChange(double itemCost, double dollarsProvided) {
        return dollarsProvided - itemCost;
        }
    }

