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

rivate JFrame bankCardFrame;
private JPanel bankCardPanel;
private JButton debitCardButton, creditCardButton;

//instance variable for k2
private JFrame debitCardFrame;
private JPanel debitCardPanel;
private JLabel debitLabel, cardIdLabel, clientNameLabel, issuerBankLabel, balanceAmountLabel, bankAccountLabel, pinLabel, withdrawalAmountLabel, dateOfWithdrawalLabel;
private JTextField cardIdTextField, clientNameTextField, issuerBankTextField, balanceAmountTextField, bankAccountTextField, pinTextField, withdrawalAmountTextField;
private JButton addButton, goBackButton;
private JComboBox dayComboBox, monthComboBox, yearComboBox;
private JButton withdrawButton, displayButton, clearButton;

//instance variable for k3
private JFrame creditCardFrame;
private JPanel creditCardPanel;
private JLabel creditLabel, cardIdLabel, clientNameLabel, issuerBankLabel, balanceAmountLabel, bankAccountLabel, cvcLabel, rateLabel, limitLabel, graceLabel, expDateLabel;
private JButton addCreditButton, cancelCreditButton, setLimitButton, displayButton, clearButton, goBackButton;
private JComboBox dayComboBox, monthComboBox, yearComboBox;
private JTextField cardIdTextField, clientNameTextField, issuerBankTextField, balanceAmountTextField, bankAccountTextField, cvcTextField, rateTextField, limitTextField, graceTextField;
public class BankGUI implements ActionListener
{
    //instance variable for k1
    private JFrame bankcard;
    private JPanel bank_card;
    private JButton debitcard,creditcard;
   
    //instance variable for k2
    private JFrame debitCardFrame;
    private JPanel Debitcard;
    private JLabel deblabel,cardid,Client_name,Issuer_bank,balance_amt,bank_acc,pin,withdrawal_amt,dateof_withdrawal;
    private JTextField cid,client,issuer,balance,account,pinn,w_amt;
    private JButton add,goback;
    private JComboBox dayy,month,yearr;
    private JButton withdraw,display,clear;
    
    //instance variable for k3
    private JFrame Ccard;
    private JPanel Creditcard;
    private JLabel clabel,card_id,c_name,i_bank,balance_amount,bank_account,cvc,rate,limit,grace,expdate;
    private JButton add_credit,cancelcredit,setlimit,dis,Clear,go_back;
    private JComboBox day,Month,year;
    private JTextField Card,cli,iss,bal,bank,pi,intr,cr_li,gp;
   
    //creating arraylist
    ArrayList<BankCard> a_list = new ArrayList<BankCard>();
   
    public void actionPerformed(ActionEvent k)
    {
        //add button
        //using getsource for debit card
        if(k.getSource() == debitcard)
        {
           bankcard.dispose();
           k2();
        }
       
        else if (k.getSource() == add)
        {
            int pin_Number = Integer.valueOf(pinn.getText());
            int balance_Amount = Integer.valueOf(balance.getText());
            int card_Id = Integer.valueOf(cid.getText());
            String bank_Account = account.getText();
            String issuer_Bank = issuer.getText();
            String client_Name = client.getText();
           
            boolean j = false;
            for (BankCard jj : a_list)
            {
                if(jj instanceof DebitCard)
                {
                    if (jj.getCardId()== card_Id)
                    {
                        j = true;
                    }
                }
            }
            if( j = false)
            {
                //creating obj
                DebitCard k_debit = new DebitCard(balance_Amount, card_Id,bank_Account, issuer_Bank,client_Name,pin_Number);
                a_list.add(k_debit);
               
                //creating JOptionPane for message dialogue
                JOptionPane.showMessageDialog(Debitcard, "Sucessfully added");
            }
            else
            {
                JOptionPane.showMessageDialog(Debitcard, "Your detail is already added.");
            }
        }
        else if (k.getSource() == withdraw)
        {
            int pin_Number = Integer.valueOf(pinn.getText());
            int card_Id = Integer.valueOf(cid.getText());
            int withdrawal_Amount = Integer.valueOf(w_amt.getText());

            String day = dayy.getSelectedItem().toString();
            String months = month.getSelectedItem().toString();
            String year = yearr.getSelectedItem().toString();
            String dateof_withdrawal = day+months+year;
           
            for(BankCard jj : a_list)
            {
                if(jj instanceof DebitCard)
                {
                    //downcasting
                    DebitCard a = (DebitCard)jj;
                    if(jj.getCardId()== card_Id)
                    {
                        //message dialog
                        JOptionPane.showMessageDialog(Debitcard,"The cardID is:"+cardid+"\n"+"The withdrawal amount is:"+withdrawal_amt+"\n"+"The date of withdrawal is:"+dateof_withdrawal+"\n");
                    }
                }
            }
        }
       
        else if (k.getSource() == goback)
        {
            debitCardFrame.dispose();
            k1();
        }
       
        else if (k.getSource() == display)
        {
            int pin_number = Integer.valueOf(pinn.getText());
            int balance_amount = Integer.valueOf(balance.getText());
            int cardid = Integer.valueOf(cid.getText());
            String bank_account = account.getText();
            String issuer_bank = issuer.getText();
            String client_name = client.getText();

            int withdrawal_amt = Integer.valueOf(w_amt.getText());
            String day = dayy.getSelectedItem().toString();
            String months = month.getSelectedItem().toString();
            String year = yearr.getSelectedItem().toString();
            String dateof_withdrawal = day+months+year;
        }
       
        else if (k.getSource() == clear)
        {
            cid.setText("");
            client.setText("");
            issuer.setText("");
            balance.setText("");
            account.setText("");
            pinn.setText("");
            w_amt.setText("");
        }
       
        //for credit card
        //using getsource for credit card
        else if (k.getSource() == creditcard)
        {
            bankcard.dispose();
            k3();
        }
       
        else if (k.getSource() == add_credit)
        {
            //logic for adding credit card
            int card_Id = Integer.valueOf(Card.getText());
            String client_Name = cli.getText();
            String issuer_Bank = iss.getText();
            String bank_Account = bank.getText();
            int balance_Amount = Integer.valueOf(bal.getText());
            int cvc_num = Integer.valueOf(pi.getText());
            double interest_Rate = Double.valueOf(intr.getText());
            String d = day.getSelectedItem().toString();
            String m = Month.getSelectedItem().toString();
            String y = year.getSelectedItem().toString();
            String expiration_Date = d+m+y;
           
            //creating obj
            CreditCard card = new CreditCard(card_Id,client_Name,issuer_Bank,bank_Account,balance_Amount,cvc_num,interest_Rate,expiration_Date);
            a_list.add(card);
            //creating JOptionPane for message dialog
            JOptionPane.showMessageDialog(Creditcard, "Sucessfully added");
        }
       
        else if (k.getSource() == cancelcredit)
        {
           
        }
       
        else if (k.getSource() == setlimit)
        {
           
        }
       
        else if (k.getSource() == go_back)
        {
            Ccard.dispose();
            k1();
        }
       
        else if (k.getSource() == dis)
        {
            System.out.println("");
        }
       
        else if (k.getSource() == Clear)
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
   
    public void k1()
    {
        //creating JFrame
        bankcard = new JFrame();
        bankcard.setTitle("Bank Card");
        bankcard.setBounds(0, 0, 1000, 900);
        bankcard.setResizable(false);
        bankcard.setLayout(null);
       
        //creating JPanel
        bank_card = new JPanel();
        bank_card.setBounds(0, 0, 1000, 900);
        bank_card.setBackground(Color.ORANGE);
        bank_card.setLayout(null);
       
        //Creating JButton
        //debit card
        debitcard = new JButton();
        debitcard.setText("Debit Card");
        debitcard.setFont(new Font("Arial",Font.BOLD,30));
        debitcard.setBounds(300, 250, 350, 80);
        bank_card.add(debitcard);
        //adding ActionListener
        debitcard.addActionListener(this);
        
       
        //credit card
        creditcard= new JButton();
        creditcard.setText("Credit Card");
        creditcard.setFont(new Font("Arial",Font.BOLD,30));
        creditcard.setBounds(300, 450, 350, 80);
        bank_card.add(creditcard);
        //adding ActionListener
        creditcard.addActionListener(this);
       
        bankcard.add(bank_card);
        bankcard.setVisible(true);
    }
   
    public void k2()
    {
        //adding JFrame
        debitCardFrame = new JFrame();
        debitCardFrame.setTitle("Debit Card");
        debitCardFrame.setBounds(0, 0, 1000, 900);
        debitCardFrame.setResizable(false);
        debitCardFrame.setLayout(null);
       
        //adding JPanel
        Debitcard = new JPanel();
        Debitcard.setBounds(0, 0, 1000, 900);
        Debitcard.setBackground(Color.PINK);
        Debitcard.setLayout(null);
       
        //adding JLabel
        deblabel = new JLabel("Debit Card");
        deblabel.setBounds(360, 15, 250, 50);
        deblabel.setFont(new Font("Arial", Font.BOLD,40));
        Debitcard.add(deblabel);
       
        cardid = new JLabel("Card ID");
        cardid.setBounds(50, 65, 100, 100);
        cardid.setFont(new Font("Arial", Font.PLAIN,20));
        Debitcard.add(cardid);
       
        Client_name = new JLabel("Client Name");
        Client_name.setBounds(500, 65, 200, 100);
        Client_name.setFont(new Font("Arial", Font.PLAIN,20));
        Debitcard.add(Client_name);
       
        Issuer_bank = new JLabel("Issuer Bank");
        Issuer_bank.setBounds(50, 150, 200, 100);
        Issuer_bank.setFont(new Font("Arial", Font.PLAIN,20));
        Debitcard.add(Issuer_bank);
       
        balance_amt = new JLabel("Balance Amount");
        balance_amt.setBounds(500, 150, 200, 100);
        balance_amt.setFont(new Font("Arial", Font.PLAIN,20));
        Debitcard.add(balance_amt);
       
        bank_acc = new JLabel("Bank Account");
        bank_acc.setBounds(50, 235, 200, 100);
        bank_acc.setFont(new Font("Arial", Font.PLAIN,20));
        Debitcard.add(bank_acc);
       
        pin = new JLabel("PIN Number");
        pin.setBounds(500, 235, 150, 100);
        pin.setFont(new Font("Arial", Font.PLAIN,20));
        Debitcard.add(pin);
       
        withdrawal_amt = new JLabel("Withdrawal Amount");
        withdrawal_amt.setBounds(50, 420, 200, 100);
        withdrawal_amt.setFont(new Font("Arial", Font.PLAIN,20));
        Debitcard.add(withdrawal_amt);
       
        dateof_withdrawal = new JLabel("Date of Withdrawal");
        dateof_withdrawal.setBounds(50, 520, 200, 100);
        dateof_withdrawal.setFont(new Font("Arial", Font.PLAIN,20));
        Debitcard.add(dateof_withdrawal);
       
        //adding JTextField
        cid = new JTextField();
        cid.setBounds(190, 90, 200, 40);
        Debitcard.add(cid);
       
        client = new JTextField();
        client.setBounds(660, 90, 200, 40);
        Debitcard.add(client);
       
        issuer = new JTextField();
        issuer.setBounds(190, 175, 200, 40);
        Debitcard.add(issuer);
       
        balance = new JTextField();
        balance.setBounds(660, 175, 200, 40);
        Debitcard.add(balance);
       
        account = new JTextField();
        account.setBounds(190, 265, 200, 40);
        Debitcard.add(account);
       
        pinn = new JTextField();
        pinn.setBounds(660, 265, 200, 40);
        Debitcard.add(pinn);
       
        w_amt = new JTextField();
        w_amt.setBounds(250, 450, 200, 40);
        Debitcard.add(w_amt);
       
        //adding JButton
        //add debit card
        add = new JButton();
        add.setText("Add Debit card");
        add.setBounds(400, 375, 200, 40);
        Debitcard.add(add);
        //adding ActionListener
        add.addActionListener(this);
       
        //goback
        goback = new JButton();
        goback.setText("Go back");
        goback.setBounds(870, 15, 100, 30);
        Debitcard.add(goback);
        //adding ActionListener
        goback.addActionListener(this);
       
        //Creating JComboBox
        String [] day = {"1","2", "3", "4", "5", "6", "7", "8", "9",
        "10","11","12", "13", "14", "15", "16", "17", "18", "19","20",
        "21","22", "23", "24", "25", "26", "27", "28", "29","30","31"};
        JComboBox dayy  = new JComboBox(day);
        dayy.setBounds (250, 550, 75, 30);
        Debitcard.add(dayy);
       
        String [] months= {"January", "February", "March", "April", "May",
        "June", "July", "August","September", "October", "November", "December"};
        JComboBox month = new JComboBox(months);
        month.setBounds (350, 550, 75, 30);
        Debitcard.add(month);
       
        String [] year = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000", "2001","2002","2003","2004","2005",
        "2006", "2007","2008","2009","2010","2011",
        "2012", "2013","2014","2015","2016","2017",
        "2018", "2019","2020","2021","2022","2023"};
        JComboBox yearr = new JComboBox(year);
        yearr.setBounds (450, 550, 75, 30);
        Debitcard.add(yearr);
       
        //Creating JButton
        withdraw = new JButton();
        withdraw.setText("Withdraw");
        withdraw.setBounds(290, 650, 100, 40);
        Debitcard.add(withdraw);
        //adding ActionListener
        withdraw.addActionListener(this);
       
        display = new JButton();
        display.setText("Display");
        display.setBounds(430, 650, 100, 40);
        Debitcard.add(display);
        //adding ActionListener
        display.addActionListener(this);
       
        clear = new JButton();
        clear.setText("Clear");
        clear.setBounds(570, 650, 100, 40);
        Debitcard.add(clear);
        //adding ActionListener
        clear.addActionListener(this);
       
        debitCardFrame.add(Debitcard);
        debitCardFrame.setVisible(true);
    }
   
    public void k3()
    {
        //adding JFrame
        Ccard = new JFrame();
        Ccard.setTitle("Credit Card");
        Ccard.setBounds(0, 0, 1000,900);
        Ccard.setResizable(false);
        Ccard.setLayout(null);
       
        //adding JPanel
        Creditcard = new JPanel();
        Creditcard.setBounds(0, 0, 1000, 900);
        Creditcard.setBackground(Color.cyan);
        Creditcard.setLayout(null);
       
        //Creating JLabel
        clabel = new JLabel("Credit Card");
        clabel.setBounds(360, 15, 250, 50);
        clabel.setFont(new Font("Arial", Font.BOLD,40));
        Creditcard.add(clabel);
       
        card_id = new JLabel("Card ID");
        card_id.setBounds(50, 65, 100, 100);
        card_id.setFont(new Font("Arial", Font.PLAIN,20));
        Creditcard.add(card_id);
       
        c_name = new JLabel("Client Name");
        c_name.setBounds(500, 65, 200, 100);
        c_name.setFont(new Font("Arial", Font.PLAIN,20));
        Creditcard.add(c_name);
       
        i_bank = new JLabel("Issuer Bank");
        i_bank.setBounds(50, 150, 200, 100);
        i_bank.setFont(new Font("Arial", Font.PLAIN,20));
        Creditcard.add(i_bank);
       
        balance_amount = new JLabel("Balance Amount");
        balance_amount.setBounds(500, 150, 200, 100);
        balance_amount.setFont(new Font("Arial", Font.PLAIN,20));
        Creditcard.add(balance_amount);
       
        bank_account = new JLabel("Bank Account");
        bank_account.setBounds(50, 235, 200, 100);
        bank_account.setFont(new Font("Arial", Font.PLAIN,20));
        Creditcard.add(bank_account);
       
        cvc = new JLabel("CVC Number");
        cvc.setBounds(500, 235, 150, 100);
        cvc.setFont(new Font("Arial", Font.PLAIN,20));
        Creditcard.add(cvc);
       
        rate = new JLabel("Interest Rate");
        rate.setBounds(50, 420, 130, 100);
        rate.setFont(new Font("Arial", Font.PLAIN,20));
        Creditcard.add(rate);
       
        limit = new JLabel("Credit Limit");
        limit.setBounds(50, 520, 100, 100);
        limit.setFont(new Font("Arial", Font.PLAIN,20));
        Creditcard.add(limit);
       
        grace = new JLabel("Grace Period");
        grace.setBounds(500, 420, 200, 100);
        grace.setFont(new Font("Arial", Font.PLAIN,20));
        Creditcard.add(grace);
       
        expdate = new JLabel("Expiration Date");
        expdate.setBounds(500,520,200, 100);
        expdate.setFont(new Font("Arial", Font.PLAIN,20));
        Creditcard.add(expdate);
       
        //Creating JTextField
        Card = new JTextField();
        Card.setBounds(190, 90, 200, 40);
        Creditcard.add(Card);
     
        cli = new JTextField();
        cli.setBounds(660, 90, 200, 40);
        Creditcard.add(cli);
     
        iss = new JTextField();
        iss.setBounds(190, 175, 200, 40);
        Creditcard.add(iss);
     
        bal = new JTextField();
        bal.setBounds(660, 175, 200, 40);
        Creditcard.add(bal);
     
        bank = new JTextField();
        bank.setBounds(190, 265, 200, 40);
        Creditcard.add(bank);
     
        pi = new JTextField();
        pi.setBounds(660, 265, 200, 40);
        Creditcard.add(pi);
   
        intr = new JTextField();
        intr.setBounds(180, 450, 200, 40);
        Creditcard.add(intr);
       
        cr_li = new JTextField();
        cr_li.setBounds(180, 550, 200, 40);
        Creditcard.add(cr_li);
       
        gp = new JTextField();
        gp.setBounds(650, 450, 200, 40);
        Creditcard.add(gp);
       
        //Creating JButton
        add_credit = new JButton();
        add_credit.setText("Add Credit card");
        add_credit.setBounds(250, 350, 200, 40);
        Creditcard.add(add_credit);
        //adding ActionListener
        add_credit.addActionListener(this);
       
        cancelcredit = new JButton();
        cancelcredit.setText("Cancel Credit card");
        cancelcredit.setBounds(500, 350, 200, 40);
        Creditcard.add(cancelcredit);
        //adding ActionListener
        cancelcredit.addActionListener(this);
       
        setlimit = new JButton();
        setlimit.setText("Set Credit Limit");
        setlimit.setBounds(250, 650, 130, 35);
        Creditcard.add(setlimit);
        //adding ActionListener
        setlimit.addActionListener(this);
       
        dis = new JButton();
        dis.setText("Display");
        dis.setBounds(450, 650, 100, 35);
        Creditcard.add(dis);
        //adding ActionListener
        dis.addActionListener(this);
       
        Clear = new JButton();
        Clear.setText("Clear");
        Clear.setBounds(650, 650, 100, 35);
        Creditcard.add(Clear);
        //adding ActionListener
        Clear.addActionListener(this);
     
        go_back = new JButton();
        go_back.setText("Go back");
        go_back.setBounds(870, 15, 100, 30);
        Creditcard.add(go_back);
        //adding ActionListener
        go_back.addActionListener(this);
       
        //Creating JComboBox
        String [] Day = {"1","2", "3", "4", "5", "6", "7", "8", "9",
        "10","11","12", "13", "14", "15", "16", "17", "18", "19","20",
        "21","22", "23", "24", "25", "26", "27", "28", "29","30","31"};
        JComboBox day  = new JComboBox(Day);
        day.setBounds (650, 555, 75, 30);
        Creditcard.add(day);
       
        String [] Months= {"January", "February", "March", "April", "May",
        "June", "July", "August","September", "October", "November", "December"};
        JComboBox Month = new JComboBox(Months);
        Month.setBounds (750, 555, 75, 30);
        Creditcard.add(Month);
       
        String [] Year = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000", "2001","2002","2003","2004","2005",
        "2006", "2007","2008","2009","2010","2011",
        "2012", "2013","2014","2015","2016","2017",
        "2018", "2019","2020","2021","2022","2023"};
        JComboBox year = new JComboBox(Year);
        year.setBounds (850, 555, 75, 30);
        Creditcard.add(year);
        
        Ccard.add(Creditcard);
        Ccard.setVisible(true);
    }
      public static void main(String[] args) {
        BankGUI gui = new BankGUI();
        gui.k1();
    }
}