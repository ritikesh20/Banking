public abstract class Bank {

    int userId;
    String userName;
    String userAddress;

    public Bank(){
        System.out.println("Default Constructor");
    }

    public Bank(int userId, String userName, String userAddress) {
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
        System.out.println("Constructor 3 parameter");
    }
    public Bank(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        System.out.println("Constructor 2 parameter");
    }

    // abstract function Common for all class
    abstract void paymentProcess();

    abstract void IFSCCode();


    // we can override in other class
    public void savingAccount() {
        System.out.println("saved balance = 10000");
    }

    public void BankCard() {
        System.out.println("Discount : 30%");
    }


}
