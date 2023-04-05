import java.util.Scanner;
class BankAccountDetails{
    private String accountHoldersName;
    private int accountNumber;
    private static double accountBalance;
    {
        this.accountHoldersName=null;
        this.accountNumber=0;   
    }
    static {
        BankAccountDetails.accountBalance=0.0;
    }
    public void setAccountHoldersName(String name){
        this.accountHoldersName=name;

    }
    public void setAccountNumber(int accountnumber){
        this.accountNumber=accountnumber;
    }
    public static void setAccountBalance(double accountbalance){
        BankAccountDetails.accountBalance=accountbalance;
    } 
    public String getAcccountHoldersName(){
        return this.accountHoldersName;
    } 
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public static double getAccountBalance(){
        return BankAccountDetails.accountBalance;
    }
}
class BankAccountTest{
    private static Scanner sc = new Scanner(System.in);
private BankAccountDetails bd = new BankAccountDetails();
public void acceptRecord(){
    System.out.println("Enter Account Holders Name");
    bd.setAccountHoldersName(sc.nextLine());
    System.out.println("Enter Account Number");
    bd.setAccountNumber(sc.nextInt());
    System.out.println("Account Balance");
    BankAccountDetails.setAccountBalance(sc.nextDouble());
} 
static long number = 8007339;
public void createNewAccount(){
   
    System.out.println("Enter Account Holders Name");
    bd.setAccountHoldersName(sc.nextLine());
    sc.nextLine();
    System.out.println("Account Number is   : "+number);
    ++number;
    System.out.println("Account Balance is "+BankAccountDetails.getAccountBalance());
}
public void printRecord(){
    System.out.println("Account Number is          :   "+bd.getAccountNumber());
    System.out.println("AccountBalance is         :   "+BankAccountDetails.getAccountBalance());
}
public static int MenuList(){
    System.out.println("0.EXIT");
    System.out.println("1.Create new Account");
    System.out.println("2.accept Record");
    System.out.println("3.printRecord");
    System.out.print("Enter Choice");
    return sc.nextInt();
}
}
public class BankAccountManagementSystem { 
    public static void main(String [] args){
        BankAccountTest bat = new BankAccountTest();
        int choice;
        while ((choice = BankAccountTest.MenuList()) !=0){
            switch (choice){
                case 1:bat.createNewAccount();
                break;
                case 2:bat.acceptRecord();
                break;
                case 3:bat.printRecord();
                break;
            }
        }
    }
    
}
