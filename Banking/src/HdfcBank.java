public class HdfcBank extends Bank {

    public HdfcBank(int userId, String userName, String userAddress) {
        super(userId, userName, userAddress);
    }

    @Override
    void paymentProcess() {
        System.out.println("HDFC PAY");
    }

    @Override
    void IFSCCode() {
        System.out.println("IFSC code : 000001234");
    }

    void BankCode() {
        System.out.println("HDFC Bank code : 1234");
    }

    void HdfcCard() {
        System.out.println("Discount - 20%");
    }

}