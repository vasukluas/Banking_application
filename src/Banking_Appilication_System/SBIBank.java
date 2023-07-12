package Banking_Appilication_System;

public class SBIBank implements RBIBankInterface {
    private String AccountNumber;
    private String password;
    private int minimumBalance=500;
    private int Balance;
    private double rateofInterest=2.5;

    public SBIBank(String accountNumber, String password, int balance) {
        this.AccountNumber = AccountNumber;
        this.password = password;
        this.Balance = Balance;
    }

    public String deposit(int money) {
        if(money > 0){
            Balance +=money;
            return "Your money "+money+" is added to BankAccount your balance is "+Balance;
        }
        return "Deposit atleast 1 Rupee";
    }

    public String withdrawmoney(int money, String password) {
       if(password.equals(this.password)){
           if(Balance-minimumBalance > money){
            return "you withdrawn amount of "+money+" your balance is "+Balance;
           }
           else{
               return "you didn't have enough money to withdrawn";
           }
       }
       else{
           return "you entered a wrong password";
       }

    }

    public String CheckBalance(String password) {
        if(password.equals(this.password)){
            return "Your balance is "+this.Balance;
        }
        return "you entered a wrong password";
    }

    public Double calculateTotalInterest(int time) {
        Double simpleInterest=(Balance*time*rateofInterest)/100;
        return simpleInterest;
    }
}
