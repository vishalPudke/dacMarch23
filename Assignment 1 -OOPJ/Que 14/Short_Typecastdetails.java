 class Short_Typecastdetails {
    public static void main(String args[]){
        short s = 1379;
        //Short sh = new Short (s);
        byte b = (byte)(s);
        System.out.println("Short to byte "+b);

        short sh = s;
        System.out.println("Short to short "+sh);

        int i = s;
        System.out.println("Short to integer "+i);

        long l = s;
        System.out.println("Short to long "+l);

        float fl = s;
        System.out.println("Short to float"+fl);

        double d = s;
        System.out.println("Short to double "+d);
    }
    
}
