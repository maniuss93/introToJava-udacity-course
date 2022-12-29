public class extra6 {
    public static void main(String[] args) {
    int total = monopolyRoll();
        System.out.println("Total: " +total);
    }
    public static int diceRoll(){
        double random = Math.random();
        //random number from 0.00-0.99
        random = random*6 + 1;
        //random number from 1.0-6.93
        return (int) random;
        //random number from 0-6
    }
    public static int monopolyRoll(){
        int roll1 = diceRoll();
        int roll2 = diceRoll();
        int total = roll1 + roll2;
        int rollsSoFar = 1;
        System.out.println("First roll: " +roll1);
        System.out.println("Second roll: " +roll2);
        while (roll1 == roll2) {
            roll1 = diceRoll();
            roll2 = diceRoll();
            rollsSoFar = rollsSoFar + 1;
            System.out.println("Third roll: " + roll1);
            System.out.println("Forth roll: " + roll2);
            total = total + roll1 + roll2;
            if (rollsSoFar >= 3) return -1;
            roll1 = diceRoll();
            roll2 = diceRoll();
            total = total + roll1 + roll2;
            rollsSoFar = rollsSoFar + 1;
        } return total;
    }

}



