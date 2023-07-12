package Banking_Appilication_System;

public class UnionBank implements RBIBankInterface{
    private String AccountNumber;
    private String password;
    private int Balance;
    private double rateOfInterest=6.5;

    public UnionBank(String AccountNumber, String password, int Balance) {
         this.AccountNumber=AccountNumber;
        this.password=password;
        this.Balance=Balance;
    }

    public String deposit(int money) {
    if(money > 0){
        Balance +=money;
        return "you added money ="+ money+"your balance is "+Balance;
    }
    return "you should add atlease 1 Rupee";
    }

    public String withdrawmoney(int money, String password) {
        if(password.equals(this.password)){
         if(Balance >= money){
             Balance -=money;
             return "You withdrawn money of "+money+" Your balance is "+Balance;
         }
         else{
             return "You not have money to withdraw";
         }
        }
        else{
            return  "Your password is wrong";
        }
    }

    public String CheckBalance(String password) {
        if(password.equals(this.password)){
            return "your balance is "+this.Balance;
        }
        else{
            return "Please enter Valid Password";
        }
    }

    public Double calculateTotalInterest(int time) {
          Double simpleInterest= (Balance*time*rateOfInterest)/100;
          return simpleInterest;
    }
}
