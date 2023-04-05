import java.util.Scanner;
class ElectricityBill {
    private String customerName;
    private double unitConsumed; 
    private double billAmount; 
    ElectricityBill(){
        this.customerName=null;
        this.unitConsumed=0.0;
    }
    {
        this.billAmount=0.0;
    }

    public void setCustomerName( String customerName){
        this.customerName=customerName;
    }
    public void setUnitConsumed(double unitConsumed){
        this.unitConsumed=unitConsumed;
    }  
    public void setcalculateBillAmount(double unitConsumed) {
        double unit=this.unitConsumed;
        while (unit != 0){
        if (unit <= 100){
            this.billAmount=unit*5;
             break;
        }
        else if(unit<=300){
            this.billAmount=100*5+(unit-100)*7;
            break;
        }
        else{
            this.billAmount=100*5+200*7+(unit-300)*10;
            break;
        }
        
    }
        
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public double getUnitConsumed(){
        return this.unitConsumed;
    }
    public double getBillAmount(){
        return (this.billAmount);
    }

}
class ElectricityBillTest{
    private static Scanner sc = new Scanner(System.in);
    private ElectricityBill eb = new ElectricityBill();
    public void acceptRecord(){
        System.out.println("Enter Customer Name");
        sc.nextLine();
        eb.setCustomerName(sc.nextLine());
        System.out.println("Enter units Consumed");
        eb.setUnitConsumed(sc.nextDouble());
        System.out.println("Confirm unit consumed");
        eb.setcalculateBillAmount(sc.nextDouble());
        
    }
public void printRecord(){
    System.out.println("Customer Name is    : "+eb.getCustomerName());
    System.out.println("Unit Consumed is    : "+eb.getUnitConsumed());
    System.out.println("Bill Amount is      : "+eb.getBillAmount());
}
public static int menuList(){
    System.out.println("0. EXIT");
    System.out.println("1.acceptRecord");
    System.out.println("2. printRecord");
    System.out.print("Enter choice");
    return sc.nextInt();
}
}
class calculateBillAmount{
    public static void main(String [] args){
        ElectricityBillTest ebt =new ElectricityBillTest();
        int choice;
        while((choice = ElectricityBillTest.menuList()) != 0){
            switch(choice){
                case 1: ebt.acceptRecord();
                break;
                case 2: ebt.printRecord();
                break;
            }
        }
    }
}
