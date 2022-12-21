public class excercise3 {
    public static void main(String[] args) {
        boolean passport = false;
        boolean birthCertificate = true;
        boolean drivingLicense = true;
        if (passport) {
            System.out.println("A passport is a valid ID");
        } else if (birthCertificate) {
            System.out.println("A birth certificate is a valid ID");
        } else if (drivingLicense) {
            System.out.println("A driving license is a valid ID");
        } else {
            System.out.println("Your identification is invalid");
        }
    }
}