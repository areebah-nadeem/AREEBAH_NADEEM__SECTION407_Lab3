class HouseMortgage extends Loan {
    public HouseMortgage(String type, double amount, double baseRate) {
        super(type, amount, baseRate);
    }
    //updating  Interest rate abstract class
    @Override
    public double InterestRate() {
        double rate=0.01;
        return rate;
    }
}