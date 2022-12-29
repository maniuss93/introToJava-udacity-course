public class extra4 {
    public static void main(String[] args) {
        String [] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        printInReverse(weekdays);
    }
    public static void printInReverse(String[] stringArray){
        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.println(stringArray[i]);
        }

    }
}
