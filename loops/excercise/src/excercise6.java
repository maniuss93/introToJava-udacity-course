public class excercise6 {
    public static void main(String[] args) {
    boolean result = rollASix();
        System.out.println(result);
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
    public static boolean rollASix(){
        int dice = rollDice();
        while(dice !=6) {
            dice = rollDice();
            if (dice == 3) {
                break;
            }
        }
        if (dice == 6)
            return true;
        else
            return false;
    }
}



