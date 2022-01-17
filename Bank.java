public class Bank {

   public CheckingAccount accountOne;
   public CheckingAccount accountTwo;

    public Bank() {
        accountOne = new CheckingAccount("Zue", 100, "1");
        accountOne = new CheckingAccount("Hades", 200, "1");
    }

    public static void main(String[] args) {

        Bank bankOfGods = new Bank();
        System.out.println(bankOfGods.accountOne.firstName);
        System.out.println(bankOfGods.accountOne.balance);
        
    }
    
}
