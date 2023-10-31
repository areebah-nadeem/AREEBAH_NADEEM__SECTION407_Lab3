class CarLoan extends Loan {
    public CarLoan(String type, double amount, double baseRate) {
        super(type, amount, baseRate);
    }
    //updating  Interest rate abstract class
    @Override
    public double InterestRate() {
        double rate=0.03;
        return rate;
    }
}