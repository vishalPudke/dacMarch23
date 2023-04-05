import java.util.Scanner;
class CustomerTelephoneDetails{
    private String customerName;
    private String telephoneNumber;
    private int numberOfCallsMade;
    private double durationOfCalls;
    private double telephoneBill;

   public  CustomerTelephoneDetails(){
        this.customerName=null;
        this.telephoneNumber="";
        this.numberOfCallsMade=0;
        
    }
    {
        this.durationOfCalls=0.0;
        this.telephoneBill=0.0;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setTelephoneNumber(String telephoneNumber){
        this.telephoneNumber=telephoneNumber;
    }
    public void setNumberOfCallsMade(int numberOfCallsMade){
        this.numberOfCallsMade=numberOfCallsMade;
    }
    public void setDurationOfCalls(double durationOfCalls){
        this.durationOfCalls=durationOfCalls;
        while (this.durationOfCalls != 0){
            if (this.durationOfCalls < 1 ){
                this.durationOfCalls=1.0;
                break;
            }
            break;
        }
            
    }
 
    
    public void setTelephoneBill(){
        while  (this.numberOfCallsMade !=0){
            if (this.numberOfCallsMade<=100){
                this.telephoneBill=this.numberOfCallsMade*50;
                //this.telephoneBill=(this.telephoneBill/this.durationOfCalls);
                break;
            }
            else if(this.numberOfCallsMade > 100){
                this.durationOfCalls=(100*50)+((this.numberOfCallsMade-100)*25);
                //this.telephoneBill = ((100*50)/100)+(((this.numberOfCallsMade-100)*25)/(this.durationOfCalls-100));
               // this.telephoneBill=(this.telephoneBill/this.durationOfCalls);
                break;
            }
        }


    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getTelephoneNumber(){
        return this.telephoneNumber;
    }
    public int getNumberOfCallsMade(){
        return this.numberOfCallsMade;
    }
    public double getDurationOfCalls(){
        return this.durationOfCalls;
    }
    public double getTelephoneBill(){
        return  this.telephoneBill;
    }
}
class TelephoneBillTest{
    private static Scanner sc= new Scanner(System.in);
    private CustomerTelephoneDetails ctd = new CustomerTelephoneDetails();
    public void acceptRecord(){
        System.out.println("Enter Name of Customer");
        sc.nextLine();
        ctd.setCustomerName(sc.nextLine());
        System.out.println("Enter Phone Number");
        ctd.setTelephoneNumber(sc.nextLine());
        System.out.println("Enter number of calls made");
        ctd.setNumberOfCallsMade(sc.nextInt());
        System.out.println(" Enter Duration of calls");
        ctd.setDurationOfCalls(sc.nextDouble());
        ctd.setTelephoneBill();

    }
    public void printRecord(){
        System.out.println("Name of Customer is                       :   "+ctd.getCustomerName());
        System.out.println("Telephone Number is                       :   "+ctd.getTelephoneNumber());
        System.out.println("Number of calls are                       :   "+ctd.getNumberOfCallsMade());
        System.out.println("Duration of calls (in minutes)            :   "+ctd.getDurationOfCalls());
        System.out.println("Telephone Bill of customr in (cents) is   :   "+ctd.getTelephoneBill());
    }
    public static int menuList(){
        System.out.println("0.EXIT");
        System.out.println("1.acceptRecord");
        System.out.println("2.printRecord");
        System.out.print("Enter Choice ");
        return (sc.nextInt());
    }

}
class TelephoneBillCalculation {
    public static void main(String [] args){
    TelephoneBillTest tb = new TelephoneBillTest();
        int choice ;
         while((choice=TelephoneBillTest.menuList()) !=0){
            switch (choice){
                 case 1: tb.acceptRecord();
                 break;
                 case 2: tb.printRecord();
                 break;
            }
        }
    }
        
}       

