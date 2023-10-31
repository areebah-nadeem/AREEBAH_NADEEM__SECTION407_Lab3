
import java.util.Scanner;

public class Main {
    public static final double BASE = 0.02;
    public static Loan[] loans = new Loan[1000];
    public static int count = 0;

    public static void main(String[] args) {
        int scannerInt;
        do {
            scannerInt = mainMenu();
            switchOption(scannerInt);
           } while (scannerInt != 4);
    }

    public static int mainMenu() {
        int scannerInt;
        System.out.print("----------------------------------------\n");
        System.out.print("Choose an option:\n");
        System.out.print("----------------------------------------\n");
        System.out.print("1: Disburse a loan\n");
        System.out.print("2: Show the list of all loans\n");
        System.out.print("3: Show sum of all loans\n");
        System.out.print("4: Exit\n");
        Scanner scanner = new Scanner(System.in);
        scannerInt = scanner.nextInt();
        return scannerInt;
    }

    public static void disburseLoan() {
        double loanAmount;
        System.out.print("----------------------------------------\n");
        System.out.print("Choose loan type:\n");
        System.out.print("----------------------------------------\n");
        System.out.print("1: House mortgage\n");
        System.out.print("2: Car loan\n");
        System.out.print("3: Personal loan\n");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        System.out.print("Enter the desired amount of Loan:\n");
        loanAmount = scanner.nextDouble();

        if (loanAmount > 300000) {
            System.out.println("Sorry:\n Our organization cannot give a loan more than $300,000.");
        }
        else {
            Loan myLoan = null;
            switch (option) {
                case 1:
                    myLoan = new HouseMortgage("House mortgage",loanAmount, BASE);
                    break;
                case 2:
                    myLoan = new CarLoan("Car loan", loanAmount, BASE);
                    break;
                case 3:
                    myLoan = new PersonalLoan("Personal loan", loanAmount, BASE);
                    break;
                default:
                    System.out.println("Invalid loan type.");
            }


            if (myLoan == null) {
                System.out.println(" ");
            }
            else {

                loans[count] = myLoan;
                count=count+1;
            }
        }
    }

    public static void  printingAllLoans() {
        System.out.println("+--------------------------+");
        System.out.println("List of all loans:");
        for (int i = 0; i < count; i++) {
            System.out.println(loans[i]);
        }
        System.out.println("+--------------------------+");
    }

    public static void printingSumOfAllLoans() {
        double sum=0;
        double total=0;
        for (int i = 0; i < count; i++) {
            sum += loans[i].calculateTotalAmountOwed();
            total+= loans[i].calculateTotalAmount();
        }
        System.out.println("+--------------------------+");
        System.out.println("Ammount :\n $" + total);
        System.out.println("Ammount Owed:\n $" + sum);
        System.out.println("+--------------------------+");

    }

    public static void switchOption(int scannerInt) {

        switch (scannerInt) {
            case 1:
                disburseLoan();
                System.out.println("Disburse Loan Selected");
                break;
            case 2:
                printingAllLoans();
                System.out.println("Show All Loans Selected");

                break;
            case 3:
                printingSumOfAllLoans();
                System.out.println("Sum All Loans Selected");
                break;
            case 4:
                System.out.println("Thanks for using the app!");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
