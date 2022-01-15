public class Conditional {

boolean isFilled;
double billAmount;
String shipping;
String couponCode;

//Class constructor method
//This constructor method takes fee arguments 
public Conditional (boolean filled, double cost, String shippingMethod, String coupon) {
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
    couponCode = coupon;
}
public void ship() {
    if(isFilled) {
        System.out.println("Shipping");
    }
}

    public static void main(String[] args) {

    }
}