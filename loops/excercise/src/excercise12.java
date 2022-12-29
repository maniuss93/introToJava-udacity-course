public class excercise12 {
    public static void main(String[] args) {
        String [] names = {"James", "Karoline", "Alex", "Nicky", "Peter"};
        String result = findLongestName(names);
        System.out.println(result);
    }
    public static String findLongestName(String [] names) {
        int size = names.length;
        String longestName = names[0];
        for (int i = 1; i < size; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
        } return longestName;
    }
}
