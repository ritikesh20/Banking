public class AxisBank extends HdfcBank {
    public AxisBank(int userId, String userName, String userAddress) {
        super(userId, userName, userAddress);
    }

    @Override
    void paymentProcess() {
        super.paymentProcess();
        System.out.println("Axis paying..");
    }

    void AxisCard(){
        System.out.println("Axis Paying......");
    }


}
