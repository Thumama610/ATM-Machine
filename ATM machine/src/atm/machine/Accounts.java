
package atm.machine;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Accounts {
    public int wrong = 1;
    public int x = 1;
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    private double savingBalance;
    private double checkingBalance;
    private double customerNumber;
    private double pinNumber;
    public void setSavingBalance(double savingBalance){
        this.savingBalance = savingBalance;
    }
    public void setCustomerNumber(double customerNumber){
        this.customerNumber = customerNumber;
    }
    public void setPinNumber(double pinNumber){
        this.pinNumber = pinNumber;
    }
    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }
    public double getCustomerNumber(){
        return customerNumber;
    }
    public double getPinNumber(){
        return pinNumber;
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingBalance(){
        return savingBalance;
    }
    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    public double calcSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }
    public void getCheckingWithdrawInput(){
        System.out.println("checking account balance: "+ moneyFormat.format(getCheckingBalance()));
        System.out.println("Amount you want to withdraw from your account: ");
        double amount = menuInput.nextDouble();
        if(amount <= getCheckingBalance()){
            calcCheckingWithdraw(amount);
            System.out.println("checking account balance: "+ moneyFormat.format(getCheckingBalance()));
        }
        else{
            System.out.println("balance can't be negative."+"\n");
        }
    }
    public void getSavingWithdrawInput(){
        System.out.println("checking account balance: "+ moneyFormat.format(getSavingBalance()));
        System.out.println("Amount you want to withdraw from your account: ");
        double amount = menuInput.nextDouble();
        if(amount <= getSavingBalance()){
            calcSavingWithdraw(amount);
            System.out.println("checking account balance: "+ moneyFormat.format(getSavingBalance()));
        }
        else{
            System.out.println("balance can't be negative."+"\n");
        }
    }
    public void setCheckingDepositInput(){
        System.out.println("checking account balance: "+ moneyFormat.format(getCheckingBalance()));
        System.out.println("Amount you want to deposit: ");
        double amount = menuInput.nextDouble();
        checkingBalance = checkingBalance + amount;
        System.out.println("done!");
        System.out.println("checking account balance: "+ moneyFormat.format(getCheckingBalance()));
    }
    public void setSavingDepositInput(){
        System.out.println("checking account balance: "+ moneyFormat.format(getSavingBalance()));
        System.out.println("Amount you want to deposit: ");
        double amount = menuInput.nextDouble();
        savingBalance = savingBalance + amount;
        System.out.println("done!");
        System.out.println("checking account balance: "+ moneyFormat.format(getSavingBalance()));
    }
}
