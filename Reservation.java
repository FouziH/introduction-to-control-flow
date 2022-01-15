public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    public Reservation(int count, int capacity, boolean open) {
        if(count < 1 || count > 8) {
            System.out.println("Invalid reservation!");
        }
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }

    public void confirmedReservation() {
        if(restaurantCapacity >= guestCount && isRestaurantOpen){
            System.err.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.err.println("Reservation denied");
            isConfirmed = false;
        }
    }

    public void informUser() {
        if(!isConfirmed) {
            System.err.println("Unable to confirm reservation, please contact restaurant");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }

    public static void main (String[] args) {
        Reservation partyOfThree = new Reservation(3, 12, true);
        Reservation partyOfFour = new Reservation(4, 3, true);
    }
}
