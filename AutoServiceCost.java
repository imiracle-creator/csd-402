//Isaiah Miracle Module 12 AutoServiceCost.Java 06/01/25
public class AutoServiceCost {

    // Standard service charge
    public static double yearlyService() {
        double standardCharge = 200.00;
        return standardCharge;
    }

    // Standard service charge + oil change
    public static double yearlyService(double oilChangeFee) {
        double standardCharge = 200.00;
        return standardCharge + oilChangeFee;
    }

    // Standard service charge + oil change + tire rotation
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        double standardCharge = 200.00;
        return standardCharge + oilChangeFee + tireRotationFee;
    }

    // Standard service charge + oil change + tire rotation - coupon
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponAmount) {
        double standardCharge = 200.00;
        return standardCharge + oilChangeFee + tireRotationFee - couponAmount;
    }

    public static void main(String[] args) {
        // Test no parameter method
        System.out.println("Test 1 - No parameters: $" + yearlyService());
        System.out.println("Test 2 - No parameters: $" + yearlyService());

        // Test one parameter method
        System.out.println("Test 1 - One parameter: $" + yearlyService(35.50));
        System.out.println("Test 2 - One parameter: $" + yearlyService(40.00));

        // Test two parameters method
        System.out.println("Test 1 - Two parameters: $" + yearlyService(35.50, 25.00));
        System.out.println("Test 2 - Two parameters: $" + yearlyService(40.00, 30.00));

        // Test three parameters method
        System.out.println("Test 1 - Three parameters: $" + yearlyService(35.50, 25.00, 20.00));
        System.out.println("Test 2 - Three parameters: $" + yearlyService(40.00, 30.00, 15.00));
    }
}
