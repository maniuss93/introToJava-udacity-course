public class excercise8 {
    public static void main(String [] args) {
        int roll1 = rollDice();
        int roll2 = rollDice();
        System.out.println("Roll 1: "+roll1);
        System.out.println("Roll 2: "+roll2);
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
}
