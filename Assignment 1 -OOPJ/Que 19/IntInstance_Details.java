 class IntInstance_Details {
    public static void main(String agrs[]){
        Integer ins = new Integer(100);
        byte b =ins.byteValue();
        System.out.println("Integer Instance to Byte value      :   "+b);
        short s = ins.shortValue();
        System.out.println("Integer Instance to Short value     :   "+s);
        int num = ins;
        System.out.println("Integer Instance to Integer value   :   "+num);
        float f =ins;
        System.out.println("Integer Instance to Float value     :   "+f);
        double d = ins;
        System.out.println("Integer Instance to Double value    :   "+d);
    }
    
}
