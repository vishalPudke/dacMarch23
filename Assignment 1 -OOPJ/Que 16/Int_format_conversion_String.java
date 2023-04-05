 class Int_format_conversion_String {
    public static void main(String args[]){
        int num = 1747;
        String str = Integer.toBinaryString(num);
        System.out.println("Integer to binary string "+str);
        String str1 =Integer.toOctalString(num);
        System.out.println("Integer to octal string "+str1);
        String str2 = Integer.toHexString(num);
        System.out.println("Integer to hexadecimal String "+str2);
    }
    
}
