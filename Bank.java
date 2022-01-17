public class Bank {

    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank() {
        accountOne = new CheckingAccount("Zue", 100);
        accountOne = new CheckingAccount("Hades", 200);
    }

    public static void main(String[] args) {

        Bank bankOfGods = new Bank();
        System.out.println(bankOfGods.accountOne.name);
        System.out.println(bankOfGods.accountOne.balance);
        
    }
    
}
