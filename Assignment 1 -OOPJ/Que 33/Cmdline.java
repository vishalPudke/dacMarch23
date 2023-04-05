import java.util.Scanner;
class Cmdline {
    public static void main(String args[]){
        int Number =Integer.parseInt(args[0]);
        float fl=Float.parseFloat(args[1]);
        double dl=Double.parseDouble(args[2]);

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println("Enter Input for srithmetic expression: 1.SUM 2.SUBTRACT 3.MULTIPLICATION 4.DIVISION 5.MODULUS");
        Scanner sc = new Scanner (System.in);
        int arithmeticExpression = sc.nextInt();

        switch(arithmeticExpression){

            case 1 :double sum = Number+fl+dl;
                    System.out.println(sum);
                    break;
            case 2 :double Subtract = dl-fl-Number;
                    System.out.println(Subtract);
                    break;
            case 3 :double Multiplication = dl*fl*Number;
                    System.out.println(Multiplication);
                    break;
            case 4 :double Division = dl/fl/Number;
                    System.out.println(Division);
                    break;
            case 5 :double Modulus = dl%fl%Number;
                    System.out.println(Modulus);
                    break;
            default : System.out.println("Invalid Input");
                    break;
        }

                
           
        
        }
    }
    

