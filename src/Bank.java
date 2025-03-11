public abstract class Bank {

    int userId;
    String userName;
    String userAddress;

    public Bank(int userId, String userName, String userAddress) {
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
    }

    abstract void paymentProcess();

    abstract void IFSCcode();


    public void savingAccount() {
        System.out.println("saved balance = 10000");
    }

    public void BankCard() {
        System.out.println("Discount : 30%");
    }


}
