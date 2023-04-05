 import java.util.Scanner;
 class Float_Add {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Minimum size of Float"+Float.MIN_VALUE);
        System.out.println("Maximum size of Float"+Float.MAX_VALUE);
        System.out.println("Enter two float numbers");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float value = Float.sum(num1,num2);
        System.out.println("Sum of Two float value: "+value);
    }
    
}
