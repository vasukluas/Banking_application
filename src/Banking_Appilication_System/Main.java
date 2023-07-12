package Banking_Appilication_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("choose a bank to open a account");
        System.out.println("Choose an option"+" option one for union Bank"+" option two for SBI Bank");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        System.out.println("Enter password and Intial Balance");
        String password=sc.next();
        int Balance=sc.nextInt();

        double accountnumber=Math.abs(Math.random()*Math.pow(10,9));
       String  stringacc=String.valueOf(accountnumber);
        RBIBankInterface BankAccount;

        if(option==1){
            BankAccount=new UnionBank(stringacc,password,Balance);
        }
        else{
            BankAccount=new SBIBank(stringacc,password,Balance);
        }

        String result = BankAccount.withdrawmoney(700000,"Prem123");
        System.out.println(result);

        result = BankAccount.withdrawmoney(70000,"Prem123");
        System.out.println(result);

        //Deposit money : 70000

        result =  BankAccount.deposit(70000);
        System.out.println(result);
        System.out.println(BankAccount.CheckBalance("Prem123"));


        System.out.println(BankAccount.calculateTotalInterest(4));
    }
}