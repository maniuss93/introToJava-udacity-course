public class excercise4 {
    public static void main(String[] args) {
        int totalBlocks = countBlocks(1);
        System.out.println(totalBlocks);
    }
    public static int countBlocks(int levels) {
        int total = 0;
        for (int i = 1; i <= levels; i++) {
            total = total + (i * i);
        }
        return total;
    }
}