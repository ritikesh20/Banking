public class ICICIBank extends Bank {
    public ICICIBank(int userId, String userName, String userAddress) {
        super(userId, userName, userAddress);
    }
    @Override
    void paymentProcess() {
        System.out.println("Icic pay");
    }
    @Override
    void IFSCCode() {
        System.out.println("ICIC IFSC Code : 00009827");
    }
}
