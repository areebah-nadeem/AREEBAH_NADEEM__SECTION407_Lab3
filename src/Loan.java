import java.sql.SQLOutput;

abstract class Loan {

    public abstract double InterestRate();
    public  String type;
    public double amount;
    public double interestRate;

    public Loan(String type, double amount, double base) {
        this.type = type;
        this.amount = amount;
        this.interestRate = base + InterestRate();
    }



    public double calculateTotalAmount() {
        return amount ;
    }

    public double calculateTotalAmountOwed() {
        double amountOwed =  amount * (1+interestRate);
        return amountOwed;
    }




    @Override
    public String toString() {

//        System.out.println("Type of loan%s"+ type);
//        System.out.println("Amount $%.2f "+ amount);
//        System.out.println("Amount Owed $%.2f "+ calculateTotalAmountOwed());
        String myData= "----------------------------\n"+type + "\nAmount: $" + String.format("%.2f", amount) + "\nAmount Owed: $" + String.format("%.2f", calculateTotalAmountOwed())+"\n----------------------------\n";
       return myData;
             }
}