public class extra5 {
    public static void main(String[] args) {
        int[] myIntArray = {1, 0, 2, 3, -1, 2};
        int result = findRange(myIntArray);
        System.out.println(result);
    }

    public static int findRange(int[] intArray) {
        if (intArray.length == 0) {
            return -1;
        }
        int smallestValue = intArray[0];
        int largestValue = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < smallestValue) {
                smallestValue = intArray[i];
            }
            if (intArray[i] > largestValue) {
                largestValue = intArray[i];
            }
        }
        return largestValue - smallestValue;
    }
}

