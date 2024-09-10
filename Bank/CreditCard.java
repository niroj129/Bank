public class CreditCard extends BankCard {
    //Additional properties of a credit card
    private int cvc_num; //Card Verification Code
    private double credit_Limit; // maximum amount of credit extended
    private double interest_Rate; //interest rate applied on credit
    private String expiration_Date; //date of expiration
    private int grace_Period; //grace period for credit card payment
    private boolean is_Granted; //whether credit card is granted or not

    //constructor for creating a new credit card
    public CreditCard(int card_Id, String client_Name, String issuer_Bank, String bank_Account, int balance_Amount, int cvc_num, double interest_Rate, String expiration_Date) {
        super(balance_Amount, card_Id, bank_Account, issuer_Bank); //call constructor of super class
        setClientName(client_Name);
        this.cvc_num = cvc_num;
        this.interest_Rate = interest_Rate;
        this.expiration_Date = expiration_Date;
        this.is_Granted = false; //initialize as not granted
    }

    //getter method for CVC property
    public int getCVC() {
        return cvc_num;
    }

    //getter method for creditLimit property
    public double getCreditLimit() {
        return credit_Limit;
    }

    //getter method for interestRate property
    public double getInterestRate() {
        return interest_Rate;
    }

    //getter method for expirationDate property
    public String getExpirationDate() {
        return expiration_Date;
    }

    //getter method for gracePeriod property
    public int getGracePeriod() {
        return grace_Period;
    }

    //getter method for isGranted property
    public boolean isIsGranted() {
        return is_Granted;
    }

    //setter method for credit limit and grace period
    //if credit limit is less than 2.5 times the balance amount
    //then credit limit and grace period is set and isGranted property is set to true
    //otherwise it prints "Credit cannot be issued"
    public void setCreditLimit(double credit_Limit, int grace_Period) {
        if (credit_Limit <= getBalanceAmount() *2.5) {
            this.credit_Limit = credit_Limit;
            this.grace_Period = grace_Period;
            this.is_Granted = true;
        } else {
            System.out.println("Credit cannot be issued");
        }
    }

    //method to cancel the credit card
    //sets all properties to default values
    public void cancelCreditCard() {
        if (!isIsGranted()) {
            System.out.println("Credit card not granted");
        }
        this.cvc_num = 0;
        this.credit_Limit = 0;
        this.grace_Period = 0;
        this.is_Granted = false;
    }

    //overridden display method to display credit card information
    //calls the super class's display method first
    //then prints additional information if credit card is granted
    public void display() {
        if (is_Granted) {
            super.display();
    
            System.out.println("Credit Limit: " + credit_Limit);
            System.out.println("Grace Period: " + grace_Period);
        }else{
            System.out.println("CVC: " + cvc_num);
            System.out.println("Interest Rate: " + interest_Rate);
            System.out.println("Expiration Date: " + expiration_Date);

        }
    }
}

