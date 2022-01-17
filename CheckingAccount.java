import javax.security.auth.login.AccountException;

public class CheckingAccount {
    private String firstName;
    private String lastName;
    private int balance;
    // public String id;

    public CheckingAccount(String inputName, String lastNameInput, int inputBalance) {
       firstName= inputName;
       lastName = lastNameInput;
        balance = inputBalance;
        // id = inputId;
    }

   private void addFunds(int fundsToAdd) {
        balance += fundsToAdd;
    }

 private void getInfo() {
        String fullName = firstName + " " + lastName;
        System.out.println("This checking account belongs to " + fullName +". It has " + balance + "dollars in it.");
    }

    public static void main(String[] args) {
        CheckingAccount myAccount = new CheckingAccount("Hamza","Mohamed", 2000);

        System.out.println(myAccount.firstName);
        System.out.println(myAccount.balance);

        myAccount.addFunds(587);
        System.out.println(myAccount.lastName);
        System.out.println(myAccount.balance);

    

    }


    
}
