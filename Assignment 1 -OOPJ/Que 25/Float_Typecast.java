 class Float_Typecast {
    public static void main(String [] args){
        Float fl = new Float(12.0f);
        float value = fl;
        byte    b   =(byte)value;
        System.out.println("Float conversion into Byte "+b);
        short   s   =(short)value;
        System.out.println("Float conversion into Short "+s);
        int     i   =(byte)value;
        System.out.println("Float conversion into Byte "+i);
        long    lg   =(byte)value;
        System.out.println("Float conversion into Byte "+lg);
        float   f   =(byte)value;
        System.out.println("Float conversion into Byte "+f);
        double  dl   =(byte)value;
        System.out.println("Float conversion into Byte "+dl);
    }
    
}
