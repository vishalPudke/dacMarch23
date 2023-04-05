import java.util.Scanner;
class ToolBooth{
    private static Scanner sc = new Scanner(System.in);
     String vehicleType;
     int numAxeles;
     double distanceTravelled;
    private double tollFee;
    private double totalAmountDue;

    ToolBooth(){
        this.vehicleType=null;
        this.numAxeles=0;
        this.distanceTravelled=0.0;
        this.tollFee=0.0;
        this.totalAmountDue=0.0;
    }
    public void setVehicleType(String vehicleType){
        this.vehicleType=vehicleType;
    }
    public void setNumAxeles(int numAxeles){
        this.numAxeles=numAxeles;
    }
    public void setDistanceTravelled(double distanceTravelled){
        this.distanceTravelled=distanceTravelled;
    }
    public String getVehicleType(){
        return this.vehicleType;
    }
    public int getNumAxeles(){
        return this.numAxeles;
    }
    public double getDistanceTravelled(){
        return this.distanceTravelled;
    } 
    public double getTollFee(){
        return this.tollFee;
    }
    public double getTotalAmountDue(){
        return this.totalAmountDue;
    }
    public String toString(){
        return String.format(this.vehicleType+" "+this.numAxeles+" "+this.distanceTravelled+" "+this.tollFee+" "+this.totalAmountDue);
    }    public void CalculateTollFee(String vehicleType,int numAxeles){
           
            if ( this.vehicleType.equalsIgnoreCase("car") || this.vehicleType.equalsIgnoreCase("van") || this.vehicleType.equalsIgnoreCase("bus")){
                this.tollFee = 0.25*(this.distanceTravelled*this.numAxeles);
                this.totalAmountDue = 2+this.tollFee;
            }
            else if (this.vehicleType.equalsIgnoreCase("truck")){
                this.tollFee = 0.5*(this.distanceTravelled*this.numAxeles);
                this.totalAmountDue = 2+this.tollFee;
            }
            System.out.println("Toll Fee is :"+this.tollFee);
        }  
        public static int menuList(){
            System.out.println("1 accept Record");
            System.out.println("2.Enter number of axles");
            System.out.println("3. distance travelled");
            System.out.println("4.Calculate toll fee");   
            System.out.println("5.Generate bill");
            System.out.print("Enter choice");
            return sc.nextInt();
        }
        public void VehicleBill(){
            
        System.out.println("Vehicle Type                    "+   this.vehicleType);
        System.out.println("Number Of Axle                  "+   this.numAxeles);
        System.out.println("Distance Travelled by vehicle   "+   this.distanceTravelled);
        System.out.println("Toll Fee                        "+   this.getTollFee());
        System.out.println("Processing fee                  $2.00");
        System.out.println("Total Amount due                "+   this.getTotalAmountDue());
    }
   
    
}     
class ToolBoothBillGenerator {
    static Scanner sc = new Scanner (System.in);
    public static void main(String [] args){
        ToolBooth ttb = new ToolBooth();
        int choice;
         while ((choice = ToolBooth.menuList())!= 0){
            switch (choice){
                case 1 :
                    System.out.print("Enter vehicle type (car, van, bus, or truck) :");
                    ttb.vehicleType= sc.next();
                    break;
                case 2 :
                   System.out.print("Enter Number Axeles ");
                    ttb.numAxeles=sc.nextInt();
                    break;
                case 3 :
                    System.out.print("Enter distance travelled by vehicle ");
                    ttb.distanceTravelled=sc.nextDouble();
                    break;
                case 4 :
                    ttb.CalculateTollFee(ttb.vehicleType, ttb.numAxeles);
                    break;
                case 5 :
                    ttb.VehicleBill();
                    break;

            } 
        }
    
    }
}
