import java.util.Random;

public class LuckyFive {
    public static void main(String[] args) {
    
    // Creating a random number generator
    Random randomGenerator = new Random();
    
    // Generate a number between 1 and 6
    int dieRoll = randomGenerator.nextInt(6) + 1;

    // Repeat while roll isn't 5


    //Example 

    int attempts = 0;
    int passcode = 0524;

    while(passcode != 0524 && attempts < 4) {
        System.out.println("Try again");
        attempts += 1;
    }
    
    
  }


    
}
