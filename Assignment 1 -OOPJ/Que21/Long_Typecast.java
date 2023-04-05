 class Long_Typecast {
    public static void main(String args[]){
        long value = 12345L;
        String str = Long.toString(value);
        System.out.println("Long value into String              :   "+str);
        Long lg = new Long(value);
        System.out.println("Long value into long instance       :   "+lg);
        String s = new String(str);
        Long l = new Long (Long.parseLong(s));
        System.out.println("String instance into Long instance  :   "+l);
        String bin = Long.toBinaryString(value);
        System.out.println("Long to Binary                      :   "+bin);
        String Hex = Long.toHexString(value);
        System.out.println("Long to Hexadecimal                 :   "+Hex);
        String Oct = Long.toOctalString(value);
        System.out.println("Long to octal                       :   "+Oct);
    }
    
}
