public class BankCard {
//Properties of the bank card
private int card_Id; //unique identifier for the card
private String client_Name; //name of the client associated with the card
private String issuer_Bank; //the bank that issued the card
private String bank_Account; //the bank account associated with the card
private int balance_Amount; //the current balance of the card
//Constructor for creating a new bank card
//Takes in initial values for balanceAmount, cardId, bankAccount, and issuerBank
public BankCard(int balance_Amount, int card_Id, String bank_Account, String issuer_Bank) {
    this.balance_Amount = balance_Amount;
    this.card_Id = card_Id;
    this.bank_Account = bank_Account;
    this.issuer_Bank = issuer_Bank;
    this.client_Name = ""; //initialize clientName as empty
}

//Getter method for cardId 
public int getCardId() {
    return card_Id;
}

//Getter method for clientName 
public String getClientName() {
    return client_Name;
}

//Setter method for clientName
public void setClientName(String client_Name) {
    this.client_Name = client_Name;
}

//Getter method for issuerBank 
public String getIssuerBank() {
    return issuer_Bank;
}

//Getter method for bankAccount 
public String getBankAccount() {
    return bank_Account;
}

//Getter method for balanceAmount 
public int getBalanceAmount() {
    return balance_Amount;
}

//Setter method for balanceAmount 
public void setBalanceAmount(int balance_Amount) {
    this.balance_Amount = balance_Amount;
}

//If clientName is empty, prints "Client name not assigned"
//Otherwise, prints the cardId, clientName, issuerBank, bankAccount, and balanceAmount
public void display() {
    if (client_Name.equals("")) {
        System.out.println("Client name is not assigned");
    } else {
        System.out.println("Displaying card information:");
        System.out.println("Card Id : " + card_Id);
        System.out.println("Client Name: " + client_Name);
        System.out.println("Issuer Bank: " + issuer_Bank);
        System.out.println("Bank Account: " + bank_Account);
        System.out.println("Balance Amount: " + balance_Amount);
    }
}};



