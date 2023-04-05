public class Stringinstance_Shortinstance {
    public static void main(String args[]){
        String str = new String("123");
        Short sh = new Short(Short.parseShort(str));
        System.out.println("String instance to Short instance "+sh);

    }
    
}
