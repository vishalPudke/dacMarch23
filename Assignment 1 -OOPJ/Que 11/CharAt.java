 class CharAt{
    public static void main(String args[]){
        String str =args[0];
        char c = str.charAt(0);
        if(Character.isDigit(c)){
            int value = (int)c;
            int codepoint = Character.getNumericValue(c);

            System.out.println("Character is a :"+c);
            System.out.println("Character is a:"+value);
            System.out.println("codepoint of character "+codepoint);
        }
        else if(Character.isLetter(c)){
            if(Character.isLowerCase(c)){
                char Upcase = Character.toUpperCase(c);
                System.out.println("Character Uppercase is: "+Upcase);
            }
        
        else if(Character.isUpperCase(c)){
                char lowercase = Character.toLowerCase(c);
                System.out.println("Character Lowercase is "+lowercase);
            }
        }
    
    }
}
