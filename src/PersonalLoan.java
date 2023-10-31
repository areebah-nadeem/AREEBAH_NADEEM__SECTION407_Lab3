class PersonalLoan extends Loan {
    public PersonalLoan(String type, double amount, double base) {
       super(type, amount, base);

    }
    //updating  Interest rate
    @Override
    public double InterestRate() {
        double rate=0.04;
        return rate;
    }
}