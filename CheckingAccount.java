import javax.security.auth.login.AccountException;

public class CheckingAccount {
    private String name;
    private int balance;
    // public String id;

    public CheckingAccount(String inputName, int inputBalance) {
        name = inputName;
        balance = inputBalance;
        // id = inputId;
    }

   private void addFunds(int fundsToAdd) {
        balance += fundsToAdd;
    }

 private void getInfo() {
        System.out.println("This checking account belongs to " + name +". It has " + balance + "dollars in it.");
    }

    public static void main(String[] args) {
        CheckingAccount myAccount = new CheckingAccount("Hamza", 2000);

    }


    
}
