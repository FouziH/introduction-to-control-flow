public class PrimeDirective {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++) {
            int count = i;

            if(count % 3 == 0) {
                System.out.println("Fizz");
            } else if(count% 5 == 0) {
                System.out.println("Buzz");
            } else if(count % 3 == 0 && count % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(count);
            }
        }
    }
    
}
