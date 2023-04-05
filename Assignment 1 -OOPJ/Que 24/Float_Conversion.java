 class Float_Conversion {
    public static void main(String [] args){
        float value = 137.0f;
        String str  = Float.toString(value);
        System.out.println("Float value to String Value     :   "+str);
        Float fl = new Float(value);
        System.out.println("Float value into float Instance :   "+fl);
        String st = new String(str);
        System.out.println("String Instance                 :   "+st);
        Float flt = new Float(Float.parseFloat(st));
        System.out.println("String Inst into float Instance :   "+flt);
        String hex =Float.toHexString(value);
        System.out.println("Float to Hexadecimal            :   "+hex);
    }
    
}
