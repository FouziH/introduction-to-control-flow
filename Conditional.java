public class Conditional {

    boolean isFilled;
    double billAmount;
    String shipping;
    String couponCode;

    // Class constructor method
    // This constructor method takes fee arguments
    public Conditional(boolean filled, double cost, String shippingMethod, String coupon) {
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
        couponCode = coupon;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

    public double calculateShipping () {
        if (shipping.equals("Regular")) {
            return 0;
        } else if (shipping.equals("Express")) {
            if(couponCode.equals("ship50")) {
                return .85;
            } else {
                return 1.75;
            }
        } else {
            return .50;
        }
    }

    public static void main(String[] args) {
        Conditional orderBook = new Conditional(true, 15.99, "Express", "ship50");
        Conditional chemistrySet = new Conditional(false, 149.99, "freeShipping", "Regular");

        orderBook.ship();
        chemistrySet.ship();

        String course = "History";

        switch (course) {
            case "Algebra":
                System.out.println(" Enroll in Algebra");                
                break;
            case "Biology":
                System.out.println(" Enroll in Biology");
                break;
            case "History":
                System.err.println("Enroll in History");
                break;
            case "Theatre":
                System.err.println("Enroll in Theatre");
                 break;
            default:
                System.out.println("Course not found");
                break;
        }
    }
}