 class LongInst_Details {
    public static void main(String args[]){
        Long lng    = new Long(12345L);
        byte b      = lng.byteValue();
        System.out.println("Long instance into Byte     :   "+b);
        short s     = lng.shortValue();
        System.out.println("Long instance into Short    :   "+s);
        int   i     = lng.intValue();
        System.out.println("Long instance intp Integer  :   "+i);
        long lg     = lng;
        System.out.println("Long instance into Long     :   "+lg);
        float f     = lng.floatValue();
        System.out.println("Long instance into Float    :   "+f);
        double d    = lng.doubleValue();
        System.out.println("Long instance into Double   :   "+d);

    }
    
}
