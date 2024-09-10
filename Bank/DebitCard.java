public class DebitCard extends BankCard {
    //Additional properties of a debit card
    private int pin_Number; //pin number for withdrawal
    private int withdrawal_Amount; //the amount withdrawn
    private String dateOfWithdrawal; //date of withdrawal
    private boolean has_Withdrawn; //whether a withdrawal has been made or not
   
    //constructor for creating a new debit card
    public DebitCard(int balance_Amount, int card_Id, String bank_Account, String issuer_Bank, String client_Name, int pin_Number) {
        super(balance_Amount, card_Id, bank_Account, issuer_Bank); //call constructor of super class
        setClientName(client_Name);
        this.pin_Number = pin_Number;
        this.has_Withdrawn = false; //initialize as not withdrawn
    }
   
    //getter method for pinNumber property
    public int getPinNumber() {
        return pin_Number;
    }

    //getter method for withdrawalAmount property
    public int getWithdrawalAmount() {
        return withdrawal_Amount;
    }

    //setter method for withdrawalAmount property
    public void setWithdrawalAmount(int withdrawal_Amount) {
        this.withdrawal_Amount = withdrawal_Amount;
    }

    //getter method for dateOfWithdrawal property
    public String getDateOfWithdrawal() {
        return dateOfWithdrawal;
    }

    //getter method for hasWithdrawn property
    public boolean getisHasWithdrawn() {
        return has_Withdrawn;
    }
 
    //method to withdraw money from debit card
    //checks if the provided pin is valid and if there is sufficient balance before making a withdrawal
    //updates the withdrawalAmount, dateOfWithdrawal, and hasWithdrawn properties
    public void withdraw(int withdrawal_Amount, String dateOfWithdrawal, int pin_Number) {
        if (pin_Number != this.pin_Number) {
            System.out.println("The pin entered is Invalid.");
            return;
        }
         else if (withdrawal_Amount > getBalanceAmount()) {
        System.out.println("The balance amout is insufficent");
        return;
        
    }

    setWithdrawalAmount(withdrawal_Amount);
    this.dateOfWithdrawal = dateOfWithdrawal;
    this.has_Withdrawn = true;
    setBalanceAmount(getBalanceAmount() - withdrawal_Amount);
    }
    
    //overridden display method to display debit card information
    //calls the super class's display method first
    //then prints additional information if a withdrawal has been made
    public void display() {
        super.display();
        if (!has_Withdrawn){
         System.out.println("Your orginal balance: " + getBalanceAmount());
        }else{
        System.out.println("Pin Number: " + pin_Number);
        System.out.println("Withdrawal Amount: " + withdrawal_Amount);
        System.out.println("Date of Withdrawal: " + dateOfWithdrawal);
        }
    }
}



