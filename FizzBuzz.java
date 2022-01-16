class FizzBuzz {
  public static void main(String[] args) {
    for(int i = 1; i <= 100; i++) {
      int counter = i;
    
      if(counter % 3 == 0) {
        System.out.println("Fizz");

      } else if(counter % 5 == 0) {
         System.out.println("Buzz");

      } else if(counter % 3 == 0 && counter % 5 == 0 ){
          System.out.println("FizzBuzz");
      } else {
          System.out.println(counter);
      }
    }
  }
}