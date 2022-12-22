public class excercise1 {
    public static void main(String[] args) {
    }
    public static void googolLenght() {
        String googol = "1";
        int len = googol.length();
        while(len < 101){
            googol = googol + "0";
            len = googol.length();
            System.out.println(googol);
        }
    }
}