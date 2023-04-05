import java.util.Scanner;
class CreditScore{
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;

    CreditScore(){
        this.creditHistory=0;
        this.creditUtilization=0.0;
        this.paymentHistory=false;
    }
    public void setCreditHistory(int creditHistory){
        this.creditHistory=creditHistory;
    }
    public void setCreditUtilization(double creditUtilization){
        this.creditUtilization=creditUtilization;
    }
    public void setPaymentHistory(boolean paymentHistory){
        this.paymentHistory=paymentHistory;
    }
    public int getCreditHistory(){
        return this.creditHistory;
    }
    public double getCreditUtilization(){
        return this.creditUtilization;
    }
    public boolean getPaymentHistory(){
        return this.paymentHistory;
    }
    public int calculateCreditScore(){
        
        if (this.paymentHistory){
            System.out.println("Good Payment History");
            int creditScore = (this.creditHistory * 15) + (int)(this.creditUtilization * 30) + 55;
            return creditScore;
        }
        else{
            System.out.println("Bad payment History");
            int creditScore = (this.creditHistory * 15) + (int)(this.creditUtilization * 30) + 35;
            return creditScore;
        }
    }
    public void acceptRecord(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter CreditHistory");
        this.setCreditHistory(sc.nextInt());
        System.out.println("Enter CreditUtilization");
        this.setCreditUtilization(sc.nextDouble());
        System.out.println("Enter Payment History ");
        this.setPaymentHistory(sc.nextBoolean());
    }
        
}
 class CreditScoreCalculator {
        public static void main(String [] args){
            CreditScore cs = new  CreditScore();
            cs.acceptRecord();
        int creditScore =cs.calculateCreditScore();
        System.out.println("Crdit Score : "+creditScore);    
    }
}