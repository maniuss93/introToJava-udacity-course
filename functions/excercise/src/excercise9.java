public class excercise9 {
    public static void main(String [] args) {
        int roll = rollDic(8);
        System.out.println(roll);
    }
        public static int rollDic(int sides){
            double randomNumber=Math.random();
            randomNumber=randomNumber*sides;
            randomNumber=randomNumber+1;
            int randomInt=(int)randomNumber;
            return randomInt;
        }
    }
