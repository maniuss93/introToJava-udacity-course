public class excercise6 {
    public static void main(String [] args) {
        int returnedLikes = likePhoto(7, "Nice photo", false);
        int totalLikes = likePhoto(returnedLikes, "I like this", true);
    }
    public static int likePhoto(int currentlikes, String comments, boolean like) {
        System.out.println("Feedback: "+comments);
        if (like) {
            currentlikes = currentlikes +1;
        }
        System.out.println("Number of likes: "+currentlikes);
        return currentlikes;
    }
}
