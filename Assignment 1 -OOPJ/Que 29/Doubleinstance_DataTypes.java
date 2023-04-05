 import java.lang.Double;
 import java.util.Scanner;
 class Doubleinstance_DataTypes {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number for double instance");
        double num=sc.nextDouble();
        Double doubl = new Double(num);
        double d=doubl;
        byte b = (byte)d;
        System.out.println("Double instance to Byte value   :   "+b);
        short s =(short)d;
        System.out.println("Double instance to Short value  :   "+s);
        int i =(int)d;
        System.out.println("Double instance to Integer value:   "+i);
        long lg =(long)d;
        System.out.println("Double instance to Long value   :   "+lg);
        float f =(float)d;
        System.out.println("Double instance to Float value  :   "+f);
        double dl =d;
        System.out.println("Double instance to Double value :   "+dl);

    }
    
}
