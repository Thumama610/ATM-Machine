
package atm.machine;

import java.util.HashMap;
import java.util.Map.Entry;

public class OptionMenu extends Accounts{
    int selection;
    
    private final HashMap<Integer,Integer> data = new HashMap<>();
    public void getLogin(){
        System.out.println("welcome to the ATM project!");
        do{
            try{
                data.put(9876543, 9876);
                data.put(8989898, 1890);
                data.put(1234567, 1234);
                System.out.print("Enter your customer number: ");
                setCustomerNumber(menuInput.nextDouble());
                System.out.print("Enter your pin number: ");
                setPinNumber(menuInput.nextDouble());
            }
            catch(Exception e){
                System.out.println(e);
                System.out.println("\n"+"invalid character(s). only numbers"+"\n");
                x = 2;
            }
            for(Entry<Integer,Integer> entry : data.entrySet()){
                if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()){
                    wrong = 2;
                    getAccountType();
                }
            }
            if(wrong != 2){
                System.err.println("wrong customer number or pin number!");
            }
        }while(x == 1);
    }
    public void getAccountType(){
        System.out.println("select the account you want to access: ");
        System.out.println("type 1. Checking Account");
        System.out.println("type 2. Savings Account");
        System.out.println("type 3. Exit");
        System.out.print("your choice: ");
        selection = menuInput.nextInt();
        switch(selection){
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("thanks for using this ATM, bye.");
                x = 2;
                break;
            default:
                System.out.println("\n"+"invalid choise"+"\n");
                getAccountType();
        }
    }
    public void getChecking(){
        System.out.println("checking account:");
        System.out.println("type 1. view balance");
        System.out.println("type 2. withdraw funds");
        System.out.println("type 3. deposit funds");
        System.out.println("type 4. back");
        System.out.println("type 5. Exit");
        System.out.print("your choice: ");
        selection = menuInput.nextInt();
        switch(selection){
            case 1:
                System.out.println("checking account balance: "+ moneyFormat.format(getCheckingBalance()));
                getChecking();
                break;
            case 2:
                getCheckingWithdrawInput();
                getChecking();
                break;
            case 3:
                setCheckingDepositInput();
                getChecking();
                break;
            case 4:
                getAccountType();
                break;
            case 5:
                System.out.println("thanks for using this ATM, bye.");
                x = 2;
                break;
            default:
                System.out.println("\n"+"invalid choise"+"\n");
                getChecking();
        }
    }
    public void getSaving(){
        System.out.println("Saving account:");
        System.out.println("type 1. view balance");
        System.out.println("type 2. withdraw funds");
        System.out.println("type 3. deposit funds");
        System.out.println("type 4. back");
        System.out.println("type 5. Exit");
        System.out.print("your choice: ");
        selection = menuInput.nextInt();
        switch(selection){
            case 1:
                System.out.println("checking account balance: "+ moneyFormat.format(getSavingBalance()));
                getSaving();
                break;
            case 2:
                getSavingWithdrawInput();
                getSaving();
                break;
            case 3:
                setSavingDepositInput();
                getSaving();
                break;
            case 4:
                getAccountType();
                break;
            case 5:
                System.out.println("thanks for using this ATM, bye.");
                x = 2;
                break;
            default:
                System.out.println("\n"+"invalid choise"+"\n");
                getSaving();
        }
    }
    }

