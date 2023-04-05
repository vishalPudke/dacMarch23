 import java.util.Scanner;
 class BMICalculatorField{
    private double height;
    private double weight;
    
    BMICalculatorField(){
        this.height=0.0;
        this.weight=0.0;
    }
    void setHeight(int height){    
        this.height= height;
    }
        void setWeight(int weight){
        this.weight= weight;
    }
    double getHeight(){
        return (this.height);
    }
    double getWeight(){
        return (this.weight);
    }
 } 
 class BMICalculatorTest{
    private Scanner sc = new Scanner(System.in);
   private  BMICalculatorField pg = new BMICalculatorField();
   public void acceptRecord(){
    System.out.println("Height in CM");
    pg.setHeight(sc.nextInt());
    System.out.println("Weight in KG");
    pg.setWeight(sc.nextInt());
   }

   public void calculateBMI(){
    double Height = pg.getHeight();
    double Weight = pg.getWeight();
    double BMI = Weight/(Height*Height)*10000;
    System.out.printf("BMI Calculator  %.2f",BMI);
   }
 }
 class BMICalculator {
    public static void main(String [] args){
        BMICalculatorTest  bct = new BMICalculatorTest();
        bct.acceptRecord();
        bct.calculateBMI();
    }
    
}
