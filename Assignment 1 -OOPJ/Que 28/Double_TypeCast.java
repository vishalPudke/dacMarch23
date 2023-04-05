 import java.util.Scanner;
 class Double_TypeCast {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the double value");
        double dob =sc.nextDouble();
        byte b =(byte)dob;
        System.out.println("Doble to Byte conversion"+b);
        short s =(short)dob;
        System.out.println("Doble to Short conversion"+s);
        int i =(int)dob;
        System.out.println("Doble to Integer conversion"+i);
        long l =(long)dob;
        System.out.println("Doble to Long conversion"+l);
        float f =(float)dob;
        System.out.println("Doble to Byte conversion"+f);
        double d =dob;
        System.out.println("Doble to Byte conversion"+d);

        
    }
    
}
