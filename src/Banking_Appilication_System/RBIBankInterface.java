package Banking_Appilication_System;

public interface RBIBankInterface {
public String deposit(int money);
public String withdrawmoney(int money,String password);
public String CheckBalance(String password);
public Double calculateTotalInterest(int time);
}
