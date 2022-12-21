public class extra5 {
    public static void main(String [] args) {
        int results = monopolyRoll();
        System.out.println(results);
    }
    public static int diceRoll(int sides){
        double randomNumber = Math.random() * sides;
        randomNumber = randomNumber + 1;
        return (int) randomNumber;
    }
    public static int monopolyRoll() {
        int roll1 = diceRoll(6);
        int roll2 = diceRoll(6);
        int total = roll1 + roll2;
        if (roll1 == roll2) {
            int roll3 = diceRoll(6);
            int roll4 = diceRoll(6);
            total = total + roll3 + roll4;
        }
        return total;
    }
}