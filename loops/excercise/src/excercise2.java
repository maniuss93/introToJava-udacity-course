public class excercise2 {
    public static void main(String [] args) {
        int count = keepRolling();
        System.out.println(count);
    }
    public static int rollDice() {
        double randomNumber = Math.random();
        //random number between 0 and almost 1 (0.9999..)
        randomNumber = randomNumber * 6;
        //numbers 0 to almost 6
        randomNumber = randomNumber + 1;
        // number 1-7
        int randomInt = (int) randomNumber;
        //cast to intiger (ignore decimal part)
        //number from 0-9
        return randomInt;
    }
    public static int keepRolling () {
        int dice1 = rollDice();
        int dice2 = rollDice();
        int dice3 = rollDice();
        int dice4 = rollDice();
        int dice5 = rollDice();
        int count = 1;
        while (!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)) {
            //we need to re-roll
            dice1 = rollDice();
            dice2 = rollDice();
            dice3 = rollDice();
            dice4 = rollDice();
            dice5 = rollDice();
            count = count + 1;
        }
        return count;
    }
}
