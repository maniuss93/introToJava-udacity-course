public class excercise9 {
    public static void main(String[] args) {
        String [] newsOutlet = {"abc", "bbc", "CNN", "CBS", "AP", "NBC", "FOX", "npr", "sky", "Aljazeera"};
        double lucky = Math.random();
        lucky *= 10;
        int luckyIndex = (int) lucky;
        System.out.println(newsOutlet[luckyIndex]);
    }
}
