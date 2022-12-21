public class extra4 {
    public static void main(String [] args) {
        double celcius = fahrenheitToCelsius(50);
        System.out.println(celcius);
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
         return (fahrenheit- 32) * 5/9;
    }
    public static void printTemperature(double fahrenheit) {
        System.out.println("F: "+fahrenheit);
        System.out.println("C: "+fahrenheitToCelsius(fahrenheit) );
    }
}
