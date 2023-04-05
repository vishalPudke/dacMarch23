class String_instance_into_Byte_instance {
    public static void main(String args[]){
        Byte value = 1;
Byte bt = new Byte(value);
String str = new String(Byte.toString(bt));
System.out.println("Byte instance to String "+str);
    }
    
}
