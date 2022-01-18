class Noodle {
    double lengthInCentimeters;
    double withInCentimeters;
    String shape;
    String ingredients;
    String texture = "brittle";
    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
    
    this.lengthInCentimeters = lenInCent;
    this.withInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
      
  }
    public void Cooke() {
        this.texture = "cooked";
    }

    public static void main (String[] args) {

        // Spaghetti spaghettiPomodoro = new Spaghetti();
        // System.out.println(spaghettiPomodoro.texture);

        Pho  phoChay = new Pho();

        System.out.println(phoChay.shape);

    }
}