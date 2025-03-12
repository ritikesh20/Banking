public class Main {
    public static void main(String[] args) {

        Bank axis = new AxisBank(1, "Ritikesh", "Lufick");
        // axis can access all the properties of bank class but not access the own class properties
        axis.BankCard();// Access
//        axis.AxisCard();// Not Access
        HdfcBank axisBank = new AxisBank(2, "Hritikesh", "Bihar");
        // axis bank access all the properties of Bank && HDFCBank class but not accessing the own class properties
        axisBank.HdfcCard();// Access
        axisBank.BankCode();// Access
//        axisBank.AxisCard();// Not Access

        AxisBank axisPay = new AxisBank(3, "Mahesh", "Bhopal");
        // axis pay access Bank || HdfcBank || AxisBank access all 3 class properties
        axisPay.HdfcCard();// Access
        axisPay.BankCode();// Access
        axisPay.AxisCard();// Access

        axisPay.paymentProcess();

        Bank icicBank = new ICICIBank(4, "Suresh", "Delhi");
        icicBank.paymentProcess();

        DhanlaxmiBank dhanlaxmiBank = new DhanlaxmiBank() {
            @Override
            public void Deposits() {
                System.out.println("hlleo");
            }
        };

        BankOfIndia bankOfIndia = new BankOfIndia();

        bankOfIndia.Deposits();
        bankOfIndia.creditCard();
        bankOfIndia.CreditCardMaintenanceCharge();
        bankOfIndia.CreditCardMinBalance();
        bankOfIndia.FundTransfers();
        bankOfIndia.IncreaseCreditCardLimits(5000);
        bankOfIndia.SavingAccount();


    }
}