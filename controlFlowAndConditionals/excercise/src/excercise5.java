public class excercise5 {
    public static void main(String [] args) {
        boolean action = true;
        boolean romance = true;
        boolean horror = false;
        boolean comedy = true;
        if (action && romance) {
            System.out.println("This movie includes action and romance");
            if (horror || comedy) {
                System.out.println("This also includes horror and comedy");
            }
        }

    }
}
