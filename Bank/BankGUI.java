import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BankGUI implements ActionListener
{
    //instance variable for Q1
    private JFrame bankcard;
    private JPanel bank_card;
    private JButton debitcardbtn,creditcardbtn;
   
    //instance variable for Q2
    private JFrame debitCardFrame;
    private JPanel debitCardPanel;
    private JLabel debitLabel,cardIdLabel,clientNameTextFieldNameLabel,issuerBankTextFieldBankLabel,balanceAmountLabel,bankAccountLabel,pinLabel
    ,withdrawalAmountLabel,dateOfWithdrawalLabel;
    private JTextField cardIdTextField,clientNameTextField,issuerBankTextField,balance,bankAccountTextField,pinTextField,withdrawalAmountTextField;
    private JButton add,goBackButton;
    private JComboBox dayComboBox,monthComboBox,yearComboBox;
    private JButton withdraw,display,clearButton;
    
    //instance variable for Q3
    private JFrame creditCardFrame;
    private JPanel creditCardPanel;
    private JLabel creditLabel,card_idLabel,clientNameLabel,issuerBankLabel,balance_AmountLabel,bank_AccountLabel,cvc,rate,limit,grace,expDateLabel;
    private JButton add_credit,cancelcredit,setlimit,dis,Clear,go_back;
    private JComboBox day,Month,year;
    private JTextField Card,cli,iss,bal,bank,pi,intr,cr_li,gp;
   
    //creating arraylist
    ArrayList<BankCard> bank_array = new ArrayList<BankCard>();
   
     
   
    public void Q1()
    {
        //creating JFrame
        bankcard = new JFrame();
        bankcard.setTitle("Bank Card");
        bankcard.setBounds(0, 0, 400, 300);
        bankcard.setResizable(false);
        bankcard.setLayout(null);
       
        //creating JPanel
        bank_card = new JPanel();
        bank_card.setBounds(0, 0, 400, 300);
        bank_card.setBackground(Color.black);
        bank_card.setLayout(null);
       
        //Creating JButton
        //debit card
        debitcardbtn = new JButton();
        debitcardbtn.setText("Debit Card");
        debitcardbtn.setFont(new Font("Arial",Font.BOLD,28));
        debitcardbtn.setBounds(50, 100, 300, 50);
        bank_card.add(debitcardbtn);
        //adding ActionListener
        debitcardbtn.addActionListener(this);
        
       
        //credit card
        creditcardbtn= new JButton();
        creditcardbtn.setText("Credit Card");
        creditcardbtn.setFont(new Font("Arial",Font.BOLD,28));
        creditcardbtn.setBounds(50, 200, 300, 50);
        bank_card.add(creditcardbtn);
        //adding ActionListener
        creditcardbtn.addActionListener(this);
        bankcard.setLocationRelativeTo(null);
        bankcard.add(bank_card);
        bankcard.setVisible(true);
    }
   
    public void Q2()
    {
        //adding JFrame
        debitCardFrame = new JFrame();
        debitCardFrame.setTitle("Debit Card");
        debitCardFrame.setBounds(0, 0, 1000, 900);
        debitCardFrame.setResizable(false);
        debitCardFrame.setLayout(null);
       
        //adding JPanel
        debitCardPanel = new JPanel();
        debitCardPanel.setBounds(0, 0, 1000, 900);
        debitCardPanel.setBackground(Color.green);
        debitCardPanel.setLayout(null);
       
        //adding JLabel
        debitLabel = new JLabel("Debit Card");
        debitLabel.setBounds(360, 15, 250, 50);
        debitLabel.setFont(new Font("Arial", Font.BOLD,36));
        debitCardPanel.add(debitLabel);
       
        cardIdLabel = new JLabel("Card ID");
        cardIdLabel.setBounds(50, 65, 100, 100);
        cardIdLabel.setFont(new Font("Arial", Font.PLAIN,18));
        debitCardPanel.add(cardIdLabel);
       
        clientNameTextFieldNameLabel = new JLabel("Client Name");
        clientNameTextFieldNameLabel.setBounds(500, 65, 200, 100);
        clientNameTextFieldNameLabel.setFont(new Font("Arial", Font.PLAIN,18));
        debitCardPanel.add(clientNameTextFieldNameLabel);
       
        issuerBankTextFieldBankLabel = new JLabel("Issuer Bank");
        issuerBankTextFieldBankLabel.setBounds(50, 150, 200, 100);
        issuerBankTextFieldBankLabel.setFont(new Font("Arial", Font.PLAIN,18));
        debitCardPanel.add(issuerBankTextFieldBankLabel);
       
        balanceAmountLabel = new JLabel("Balance Amount");
        balanceAmountLabel.setBounds(500, 150, 200, 100);
        balanceAmountLabel.setFont(new Font("Arial", Font.PLAIN,18));
        debitCardPanel.add(balanceAmountLabel);
       
        bankAccountLabel = new JLabel("Bank Account");
        bankAccountLabel.setBounds(50, 235, 200, 100);
        bankAccountLabel.setFont(new Font("Arial", Font.PLAIN,18));
        debitCardPanel.add(bankAccountLabel);
       
        pinLabel = new JLabel("PIN Number");
        pinLabel.setBounds(500, 235, 150, 100);
        pinLabel.setFont(new Font("Arial", Font.PLAIN,18));
        debitCardPanel.add(pinLabel);
       
        withdrawalAmountLabel = new JLabel("Withdrawal Amount");
        withdrawalAmountLabel.setBounds(50, 420, 200, 100);
        withdrawalAmountLabel.setFont(new Font("Arial", Font.PLAIN,18));
        debitCardPanel.add(withdrawalAmountLabel);
       
        dateOfWithdrawalLabel = new JLabel("Date of Withdrawal");
        dateOfWithdrawalLabel.setBounds(50, 520, 200, 100);
        dateOfWithdrawalLabel.setFont(new Font("Arial", Font.PLAIN,18));
        debitCardPanel.add(dateOfWithdrawalLabel);
       
        //adding JTextField
        cardIdTextField = new JTextField();
        cardIdTextField.setBounds(190, 90, 200, 30);
        debitCardPanel.add(cardIdTextField);
       
        clientNameTextField = new JTextField();
        clientNameTextField.setBounds(660, 90, 200, 30);
        debitCardPanel.add(clientNameTextField);
       
        issuerBankTextField = new JTextField();
        issuerBankTextField.setBounds(190, 175, 200, 30);
        debitCardPanel.add(issuerBankTextField);
       
        balance = new JTextField();
        balance.setBounds(660, 175, 200, 30);
        debitCardPanel.add(balance);
       
         bankAccountTextField = new JTextField();
         bankAccountTextField.setBounds(190, 265, 200, 30);
        debitCardPanel.add( bankAccountTextField);
       
        pinTextField = new JTextField();
        pinTextField.setBounds(660, 265, 200, 30);
        debitCardPanel.add(pinTextField);
       
        withdrawalAmountTextField = new JTextField();
        withdrawalAmountTextField.setBounds(250, 450, 200, 30);
        debitCardPanel.add(withdrawalAmountTextField);
       
        //adding JButton
        //add debit card
        add = new JButton();
        add.setText("Add Debit card");
        add.setBounds(400, 375, 200, 40);
        debitCardPanel.add(add);
        //adding ActionListener
        add.addActionListener(this);
       
        //goBackButton
        goBackButton = new JButton();
        goBackButton.setText("Go back");
        goBackButton.setBounds(875, 15, 100, 30);
        debitCardPanel.add(goBackButton);
        //adding ActionListener
        goBackButton.addActionListener(this);
       
        //Creating JComboBox
        String [] day = {"1","2", "3", "4", "5", "6", "7", "8", "9",
        "10","11","12", "13", "14", "15", "16", "17", "18", "19","20",
        "21","22", "23", "24", "25", "26", "27", "28", "29","30","31"};
        dayComboBox  = new JComboBox(day);
        dayComboBox.setBounds (230, 550, 80, 30);
        debitCardPanel.add(dayComboBox);
       
        String [] monthComboBoxs= {"January", "February", "March", "April", "May",
        "June", "July", "August","September", "October", "November", "December"};
        monthComboBox = new JComboBox(monthComboBoxs);
        monthComboBox.setBounds (330, 550, 100, 30);
        debitCardPanel.add(monthComboBox);
       
        String [] year = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000", "2001","2002","2003","2004","2005",
        "2006", "2007","2008","2009","2010","2011",
        "2012", "2013","2014","2015","2016","2017",
        "2018", "2019","2020","2021","2022","2023"};
        yearComboBox = new JComboBox(year);
        yearComboBox.setBounds (450, 550, 80, 30);
        debitCardPanel.add(yearComboBox);
       
        //Creating JButton
        withdraw = new JButton();
        withdraw.setText("Withdraw");
        withdraw.setBounds(290, 650, 100, 30);
        debitCardPanel.add(withdraw);
        //adding ActionListener
        withdraw.addActionListener(this);
       
        display = new JButton();
        display.setText("Display");
        display.setBounds(430, 650, 100, 30);
        debitCardPanel.add(display);
        //adding ActionListener
        display.addActionListener(this);
       
        clearButton = new JButton();
        clearButton.setText("Clear");
        clearButton.setBounds(570, 650, 100, 30);
        debitCardPanel.add(clearButton);
        //adding ActionListener
        clearButton.addActionListener(this);
       
        debitCardFrame.add(debitCardPanel);
        debitCardFrame.setVisible(true);
    }
   
    public void Q3()
    {
        //adding JFrame
        creditCardFrame = new JFrame();
        creditCardFrame.setTitle("Credit Card");
        creditCardFrame.setBounds(0, 0, 1000,900);
        creditCardFrame.setResizable(false);
        creditCardFrame.setLayout(null);
       
        //adding JPanel
        creditCardPanel = new JPanel();
        creditCardPanel.setBounds(0, 0, 1000, 900);
        creditCardPanel.setBackground(Color.gray);
        creditCardPanel.setLayout(null);
       
        //Creating JLabel
        creditLabel = new JLabel("Credit Card");
        creditLabel.setBounds(360, 15, 250, 50);
        creditLabel.setFont(new Font("Arial", Font.BOLD,40));
        creditCardPanel.add(creditLabel);
       
        cardIdLabel = new JLabel("Card ID");
        cardIdLabel.setBounds(50, 65, 100, 100);
        cardIdLabel.setFont(new Font("Arial", Font.PLAIN,20));
        creditCardPanel.add(cardIdLabel);
       
        clientNameLabel = new JLabel("Client Name");
        clientNameLabel.setBounds(500, 65, 200, 100);
        clientNameLabel.setFont(new Font("Arial", Font.PLAIN,20));
        creditCardPanel.add(clientNameLabel);
       
        issuerBankLabel = new JLabel("Issuer Bank");
        issuerBankLabel.setBounds(50, 150, 200, 100);
        issuerBankLabel.setFont(new Font("Arial", Font.PLAIN,20));
        creditCardPanel.add(issuerBankLabel);
       
        balanceAmountLabel = new JLabel("Balance Amount");
        balanceAmountLabel.setBounds(500, 150, 200, 100);
        balanceAmountLabel.setFont(new Font("Arial", Font.PLAIN,20));
        creditCardPanel.add(balanceAmountLabel);
       
        bankAccountLabel = new JLabel("Bank Account");
        bankAccountLabel.setBounds(50, 235, 200, 100);
        bankAccountLabel.setFont(new Font("Arial", Font.PLAIN,20));
        creditCardPanel.add(bankAccountLabel);
       
        cvc = new JLabel("CVC Number");
        cvc.setBounds(500, 235, 150, 100);
        cvc.setFont(new Font("Arial", Font.PLAIN,20));
        creditCardPanel.add(cvc);
       
        rate = new JLabel("Interest Rate");
        rate.setBounds(50, 420, 130, 100);
        rate.setFont(new Font("Arial", Font.PLAIN,20));
        creditCardPanel.add(rate);
       
        limit = new JLabel("Credit Limit");
        limit.setBounds(50, 520, 100, 100);
        limit.setFont(new Font("Arial", Font.PLAIN,20));
        creditCardPanel.add(limit);
       
        grace = new JLabel("Grace Period");
        grace.setBounds(500, 420, 200, 100);
        grace.setFont(new Font("Arial", Font.PLAIN,20));
        creditCardPanel.add(grace);
       
        expDateLabel = new JLabel("Expiration Date");
        expDateLabel.setBounds(500,520,200, 100);
        expDateLabel.setFont(new Font("Arial", Font.PLAIN,20));
        creditCardPanel.add(expDateLabel);
       
        //Creating JTextField
        Card = new JTextField();
        Card.setBounds(190, 90, 200, 40);
        creditCardPanel.add(Card);
     
        cli = new JTextField();
        cli.setBounds(660, 90, 200, 40);
        creditCardPanel.add(cli);
     
        iss = new JTextField();
        iss.setBounds(190, 175, 200, 40);
        creditCardPanel.add(iss);
     
        bal = new JTextField();
        bal.setBounds(660, 175, 200, 40);
        creditCardPanel.add(bal);
     
        bank = new JTextField();
        bank.setBounds(190, 265, 200, 40);
        creditCardPanel.add(bank);
     
        pi = new JTextField();
        pi.setBounds(660, 265, 200, 40);
        creditCardPanel.add(pi);
   
        intr = new JTextField();
        intr.setBounds(180, 450, 200, 40);
        creditCardPanel.add(intr);
       
        cr_li = new JTextField();
        cr_li.setBounds(180, 550, 200, 40);
        creditCardPanel.add(cr_li);
       
        gp = new JTextField();
        gp.setBounds(650, 450, 200, 40);
        creditCardPanel.add(gp);
       
        //Creating JButton
        add_credit = new JButton();
        add_credit.setText("Add Credit card");
        add_credit.setBounds(250, 350, 200, 40);
        creditCardPanel.add(add_credit);
        //adding ActionListener
        add_credit.addActionListener(this);
       
        cancelcredit = new JButton();
        cancelcredit.setText("Cancel Credit card");
        cancelcredit.setBounds(500, 350, 200, 40);
        creditCardPanel.add(cancelcredit);
        //adding ActionListener
        cancelcredit.addActionListener(this);
       
        setlimit = new JButton();
        setlimit.setText("Set Credit Limit");
        setlimit.setBounds(250, 650, 130, 35);
        creditCardPanel.add(setlimit);
        //adding ActionListener
        setlimit.addActionListener(this);
       
        dis = new JButton();
        dis.setText("Display");
        dis.setBounds(450, 650, 100, 35);
        creditCardPanel.add(dis);
        //adding ActionListener
        dis.addActionListener(this);
       
        Clear = new JButton();
        Clear.setText("Clear");
        Clear.setBounds(650, 650, 100, 35);
        creditCardPanel.add(Clear);
        //adding ActionListener
        Clear.addActionListener(this);
     
        go_back = new JButton();
        go_back.setText("Go back");
        go_back.setBounds(870, 15, 100, 30);
        creditCardPanel.add(go_back);
        //adding ActionListener
        go_back.addActionListener(this);
       
        //Creating JComboBox
        String [] Day = {"1","2", "3", "4", "5", "6", "7", "8", "9",
        "10","11","12", "13", "14", "15", "16", "17", "18", "19","20",
        "21","22", "23", "24", "25", "26", "27", "28", "29","30","31"};
        day  = new JComboBox(Day);
        day.setBounds (650, 555, 75, 30);
        creditCardPanel.add(day);
       
        String [] Months= {"January", "February", "March", "April", "May",
        "June", "July", "August","September", "October", "November", "December"};
        Month = new JComboBox(Months);
        Month.setBounds (750, 555, 75, 30);
        creditCardPanel.add(Month);
       
        String [] Year = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000", "2001","2002","2003","2004","2005",
        "2006", "2007","2008","2009","2010","2011",
        "2012", "2013","2014","2015","2016","2017",
        "2018", "2019","2020","2021","2022","2023"};
        year = new JComboBox(Year);
        year.setBounds (850, 555, 75, 30);
        creditCardPanel.add(year);
        
        creditCardFrame.add(creditCardPanel);
        creditCardFrame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        //add button
        //using getsource for debit card
        if(e.getSource() == debitcardbtn)
        {
           bankcard.dispose();
           Q2();
        }
       
         if (e.getSource() == add)
        {
        try
            {
                int pin_Number = Integer.valueOf(pinTextField.getText());
                int balance_Amount = Integer.valueOf(balance.getText());
                int card_Id = Integer.valueOf(cardIdTextField.getText());
                String bank_Account =  bankAccountTextField.getText();
                String issuer_Bank = issuerBankTextField.getText();
                String client_Name = clientNameTextField.getText();
           
                boolean j = false;
                for (BankCard jj : bank_array)
                {
                   if(jj instanceof DebitCard)
                   {
                     if (jj.getCardId()== card_Id)
                     {
                        j = true;
                     }
                   }
                }
                if( j == false)
                {
                  //creating obj
                   DebitCard k_debit = new DebitCard(balance_Amount, card_Id,bank_Account, issuer_Bank,client_Name,pin_Number);
                   bank_array.add(k_debit);
               
                   //creating JOptionPane for message dialogue
                   JOptionPane.showMessageDialog(debitCardPanel, "Sucessfully added");
                }
                else
                {
                   JOptionPane.showMessageDialog(debitCardPanel, "Your detail is already added.");
                }
            }
            
            catch(Exception err)
            {
                JOptionPane.showMessageDialog(debitCardPanel, "Enter appropriate input");
            }
        }
        
        if (e.getSource() == withdraw)
        {
            
                
            try{
                
            int pin_Number = Integer.valueOf(pinTextField.getText());
            int card_Id = Integer.valueOf(cardIdTextField.getText());
            int withdrawal_Amount = Integer.valueOf(withdrawalAmountTextField.getText());

            String day = dayComboBox.getSelectedItem().toString();
            String months = monthComboBox.getSelectedItem().toString();
            String year = yearComboBox.getSelectedItem().toString();
            String dateof_withdrawal = day+months+year;
           
            for(BankCard jj : bank_array)
            {
                if(jj instanceof DebitCard)
                {
                    //downcasting
                    DebitCard a = (DebitCard)jj;
                    if(a.getCardId()== card_Id)
                    {
                         if(a.getBalanceAmount() > withdrawal_Amount)
                         {
                             if(a.getPinNumber() == pin_Number)
                             {
                               //message dialog
                               JOptionPane.showMessageDialog(debitCardPanel,"The cardID is: " + card_Id + "\n" + "The withdrawal amount is: " + withdrawal_Amount + "\n" + "The date of withdrawal is: " + dateof_withdrawal + "\n");
                               a.withdraw(withdrawal_Amount, dateof_withdrawal, pin_Number);
                             }
                             else
                             {
                               JOptionPane.showMessageDialog(debitCardPanel, "INCORRECT PIN NUMBER");
                             }
                         }
                         else
                         {
                             JOptionPane.showMessageDialog(debitCardPanel, "Insufficient balance");
                         }
                    }
                }
            }
          }
        catch(Exception ex)
            {
                 String invalidField = ex.getMessage().substring(ex.getMessage().lastIndexOf("\"") + 1);
    JOptionPane.showMessageDialog(debitCardPanel, "Invalid input format. Please enter a valid number in the " + invalidField + " field.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
       
         if (e.getSource() == goBackButton)
        {
            debitCardFrame.dispose();
            Q1();
        }
       
        if (e.getSource() == display)
        {    
            for(BankCard jj : bank_array)
            {
                if(jj instanceof DebitCard)
                {
                    //downcasting
                    DebitCard a = (DebitCard)jj;
                    a.display();
                    System.out.println();
                    JOptionPane.showMessageDialog(null,"Hello "+a.getClientName()+"\n"+"your Card Id is- "+a.getCardId()+"\n"+"Your Issuer Bank is-"
+a.getIssuerBank()+"\n"+"your Bank Account is- "+a.getBankAccount()+"\n"+"Your Current Balance Amount- "+a. getBalanceAmount());}
}
                    
                }
            
        
       
        else if (e.getSource() == clearButton)
        {
            cardIdTextField.setText("");
            clientNameTextField.setText("");
            issuerBankTextField.setText("");
            balance.setText("");
             bankAccountTextField.setText("");
            pinTextField.setText("");
            withdrawalAmountTextField.setText("");
        }
       
        //for credit card
        //using getsource for credit card
         if (e.getSource() == creditcardbtn)
        {
            bankcard.dispose();
            Q3();
        }
       
       if (e.getSource() == add_credit)
        {
        try
            {
            int card_Id = Integer.parseInt(Card.getText());
            String client_Name = cli.getText();
            String issuer_Bank = iss.getText();
            String bank_Account = bank.getText();
            int balance_Amount = Integer.parseInt(bal.getText());
            int cvc_num = Integer.parseInt(pi.getText());
            double interest_Rate = Double.parseDouble(intr.getText());
            String d = day.getSelectedItem().toString();
            String m = Month.getSelectedItem().toString();
            String y = year.getSelectedItem().toString();
            String expiration_Date = d+m+y;
           
                boolean j = false;
                for (BankCard jj : bank_array)
                {
                   if(jj instanceof CreditCard)
                   {
                     if (jj.getCardId()== card_Id)
                     {
                        j = true;
                     }
                   }
                }
                if( j == false)
                {
                  //creating obj
                   CreditCard k_credit = new CreditCard(card_Id,client_Name,issuer_Bank,bank_Account,balance_Amount,cvc_num,interest_Rate,expiration_Date);
                   bank_array.add(k_credit);
               
                   //creating JOptionPane for message dialogue
                   JOptionPane.showMessageDialog(creditCardPanel, "Sucessfully added");
                }
                else
                {
                   JOptionPane.showMessageDialog(creditCardPanel, "Your detail is already added.");
                }
            }
            catch (NumberFormatException err) {
               JOptionPane.showMessageDialog(creditCardPanel, "Enter appropriate input");
          }
        }
    else if (e.getSource() == cancelcredit){
        try {
            int card_Id = Integer.parseInt(Card.getText());
            boolean cardFound = false;
            for (BankCard jj : bank_array) {
                if (jj instanceof CreditCard) {
                    CreditCard a = (CreditCard) jj;
                    if (a.getCardId() == card_Id) {
                        a.cancelCreditCard();
                        
                         JOptionPane.showMessageDialog(creditCardPanel, "Your credit card has been cancelled.", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                        cardFound = true;
                        break;
                    }
                    
                }
            }
            if (!cardFound) {
                JOptionPane.showMessageDialog(creditCardPanel, "**Card ID not Found**", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(creditCardPanel, "Please enter valid numbers in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
    }
        }

else if (e.getSource() == setlimit) {
    try {
            int card_Id = Integer.parseInt(Card.getText());
            double credit_Limit = Double.parseDouble(cr_li.getText());
            int GracePeriod = Integer.parseInt(gp.getText());
            boolean cardFound = false;
            for (BankCard jj : bank_array) {
                if (jj instanceof CreditCard) {
                    CreditCard a = (CreditCard) jj;
                    if (a.getCardId() == card_Id) {
                        a.setCreditLimit(credit_Limit, GracePeriod);
                        
                            JOptionPane.showMessageDialog(creditCardPanel, "Your credit card has been issued.", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                        cardFound = true;
                        break;
                    }
                    
                }
            }
            if (!cardFound) {
                JOptionPane.showMessageDialog(creditCardPanel, "**Card ID not Found**", "Warning", JOptionPane.WARNING_MESSAGE);
            }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(creditCardPanel, "Please enter valid numbers in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
        
       
        else if (e.getSource() == go_back)
        {
            creditCardFrame.dispose();
            Q1();
        }
       
        else if (e.getSource() == dis)
        {
         for(BankCard jj : bank_array)
            {
                if(jj instanceof CreditCard)
                {
                    //downcasting
                    CreditCard a = (CreditCard)jj;
                   JOptionPane.showMessageDialog(null,"Hello "+a. getClientName()+"\n"+"your Card is- "+a.getCardId()+"\n"+"Your issuer bank is-"
                    +a. getIssuerBank()+"\n"+"your Bank Account is- "+a. getBankAccount()+"\n"+"Your CVC number is- "+a.getCVC() +"\n"
                    +"Your Current Balance Amount- "+a. getBalanceAmount());}
                    
                }
            
        }
       
        else if (e.getSource() == Clear)
        {
            Card.setText("");
            cli.setText("");
            iss.setText("");
            bank.setText("");
            bal.setText("");
            pi.setText("");
            intr.setText("");
            cr_li.setText("");
            gp.setText("");
        }
    }
      public static void main(String[] args) {
        BankGUI gui = new BankGUI();
        gui.Q1();
    }
}