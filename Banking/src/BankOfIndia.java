class BankOfIndia implements DhanlaxmiBank, KotaBank, LufickBank, PNBBank, UCOBank {

    @Override
    public void Deposits() {
        System.out.println("Deposits 5000 Successfully form DhanlaxmiBank");
    }

    @Override
    public void creditCard() {
        System.out.println("Thank you Taking Credit Car from Kotak Bank");
    }

    @Override
    public void CreditCardMinBalance() {
        System.out.println("Plz Maintenance Min 30000 Bal Per months T&C apply");
    }

    @Override
    public void CreditCardMaintenanceCharge() {
        System.out.println("Non-Maintenance charge will to 5% to 20%");
    }

    @Override
    public void FundTransfers() {
        System.out.println("10000 amount Transfer successfully form lufick bank to kotak bank ");
    }

    @Override
    public int IncreaseCreditCardLimits(int amount) {

        System.out.println("your CreditCard Limit is " + amount);
        return amount;
    }

    @Override
    public void SavingAccount() {
        System.out.println("Saving 5000 pre Months Successfully");
    }
}
