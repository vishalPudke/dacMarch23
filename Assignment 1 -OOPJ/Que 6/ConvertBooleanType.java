 class ConvertBooleanType{
    public static void main(String args[]){
        boolean value = true;
        //String str = (String)value;//error: incompatible types: boolean cannot be converted to String
        //To convert primitive data types into non primitive data types we use BOXING process 
        String str = Boolean.toString(value);
        System.out.println("Boxing : Boolean to String          :   "+str);
        Boolean bool = new Boolean (value );
        System.out.println("Boolean value into Boolean instance :   "+bool);
        boolean bool1 = Boolean.parseBoolean(str);
        System.out.println("String to boolean                   :   "+bool1);
        Boolean bool2 = new Boolean( Boolean.parseBoolean(str));
        System.out.println("String to Boolean                   :   "+bool2);
    }
    
}
