import java.util.Scanner;

class RationalNumber {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private double RatNum1;
    private double RatNum2;
RationalNumber(){
    this.num1=0;
    this.num2=0;
    this.num3=0;
    this.num4=0;
    this.RatNum1=0;
}
public void setNum1(int num1){
    this.num1=num1;
}
public void setNum2(int num2){
    this.num2=num2;
}
public void setNum3(int num3){
    this.num3=num3;
}
public void setNum4(int num4){
    this.num4=num4;
}
public int getNum1(){
    return this.num1;
}
public int getNum2(){
    return this.num2;
}
public int getNum3(){
    return this.num3;
}
public int getNum4(){
    return this.num4;
}
    
}
class TestRationalNumber{
    private static Scanner sc = new Scanner(System.in);
    RationalNumber rn = new RationalNumber();
    public void acceptRecord(){
        System.out.println("Enter First Rational Number(num1/num2)");
        System.out.println("Numerator");
        rn.setNum1(sc.nextInt());
        System.out.println("Denominator");
        rn.setNum2(sc.nextInt());
        System.out.println("Enter Second Rational Number(num3/num4)");
        System.out.println("Numerator");
        rn.setNum3(sc.nextInt());
        System.out.println("Denominator");
        rn.setNum4(sc.nextInt());
    }
    public void printRecord(){
        System.out.println("Value of num1   :   "+rn.getNum1());
        System.out.println("Value of num2   :   "+rn.getNum2());
        System.out.println("Value of num3   :   "+rn.getNum3());
        System.out.println("Value of num4   :   "+rn.getNum4());
    }
    public void Addition(){
        double addition = (rn.getNum1()/rn.getNum2())+(rn.getNum3()/rn.getNum4());
        System.out.println("Addition of two Rational Number is : "+addition);
    }
    public void Substraction(){
        double substraction = (rn.getNum1()/rn.getNum2())-(rn.getNum3()/rn.getNum4());
        System.out.println("Substraction of two Rational Number is : "+substraction);
    }
    public void Multiplication(){
        double multiplication = (rn.getNum1()/rn.getNum2())*(rn.getNum3()/rn.getNum4());
        System.out.println("Multiplication of two Rational Number is : "+multiplication);
    }
    public void Division(){
        double division = (double)(rn.getNum1()/rn.getNum2())/(rn.getNum3()/rn.getNum4());
        System.out.println("Division of two Rational Number is : "+division);
    }
    public static int menuList(){
        System.out.println("0.EXIT");
        System.out.println("1.accept Record");
        System.out.println("2.print Record");
        System.out.println("3.ADDITION");
        System.out.println("4.SUBSTRACTION");
        System.out.println("5.MULTIPLICATION");
        System.out.println("6.DIVISION");
        System.out.print("Enter Choice : ");
        return sc.nextInt();

    }
}
class RationalNumberCalculator{
    public static void main(String [] args){
        TestRationalNumber trn = new TestRationalNumber();
        int choice;
        while ((choice =TestRationalNumber.menuList())!=0){
            switch (choice){
                case 1:
                trn.acceptRecord();
                break;
                case 2:
                trn.printRecord();
                break;
                case 3:
                trn.Addition();
                break;
                case 4:
                trn.Substraction();
                break;
                case 5:
                trn.Multiplication();
                break;
                case 6:
                trn.Division();
                break;

            }
        }


    }
    

}
