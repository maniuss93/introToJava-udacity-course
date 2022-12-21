public class excercise7 {
    public static void main(String [] arg) {
        int passcode = 312;
        String coffeType;
        switch(passcode) {
            case 555: coffeType = "expresso";
                break;
            case 312: coffeType = "vanilla latte";
                break;
            case 629: coffeType = "drip coffe";
                break;
            default: coffeType = "incorrect passcode";
                break;
        }
        System.out.println(coffeType);
    }
}
