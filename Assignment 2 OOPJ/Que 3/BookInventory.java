import java.util.Scanner;
class Book{
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year ;
    private double price;
    private int quantity;
    Book(){                            //Parameterless Constructor 
        this.title=null;
        this.author=null;
        this.publisher=null;
        this.isbn=null;
        this.year=0;
        this.price=0.0;
        this.quantity=0;

    
    
    }
    void setTitle(String title){                //Setter Method to set values
        this.title=title;
    }
    void setAuthor(String author){
        this.author=author;
    }
    void setPublisher(String publisher){
        this.publisher=publisher;
    }
    void setIsbn(String isbn){
        this.isbn=isbn;
    }
    void setYear(int year){
        this.year=year;
    }
    void setPrice(double price){
        this.price=price;
    }
    void setQuantity(int quantity){
        this.quantity=quantity;
    }
    void setincreaseQuantity(int quantity){
        this.quantity=(this.quantity+quantity);
    }
    void setdecreaseQuantity(int quantity){
        this.quantity=(this.quantity-quantity);
    }
    

    String getTitle(){                      //getter Method
        return this.title;
    }
    String getAuthor(){
        return this.author;
    }
    String getPublisher(){
        return this.publisher;
    }
    String getIsbn(){
        return this.isbn;
    }
    int getYear(){
        return this.year;
    }
    double getPrice(){
        return this.price;
    }
    int getQuantity(){
        return this.quantity;
    }
    int getincreaseQuantity(){
        return (this.quantity);
    }
    int getdecreaseQuantity(){
        return (this.quantity);
    }
}
class BookTest{
    private static Scanner sc = new Scanner(System.in);
    private Book bk = new Book();
    public void acceptRecord(){
        System.out.println("Enter Title");
        sc.nextLine();
        bk.setTitle(sc.nextLine());
        System.out.println("Enter Author");
        bk.setAuthor(sc.nextLine());
        System.out.println("Enter Publisher");
        bk.setPublisher(sc.nextLine());
        System.out.println("Enter Isbn");
        bk.setIsbn(sc.nextLine());
        System.out.println("Enter Year");
        bk.setYear(sc.nextInt());
        System.out.println("Enter Price");
        bk.setPrice(sc.nextDouble());
        System.out.println("Enter Quantity");
        bk.setQuantity(sc.nextInt());
        
        
    }
   
    public void printRecord(){
        System.out.println(bk.getTitle()+" "+bk.getAuthor()+" "+bk.getPublisher()+" "+bk.getIsbn()+" "+bk.getYear()+" "+bk.getPrice()+" "+bk.getQuantity());
    }
    public void increaseQuantity(){
        System.out.println("Enter added Quantity");
        bk.setincreaseQuantity(sc.nextInt());
        System.out.println(bk.getincreaseQuantity());
    }
    public void decreaseQuantity(){
        System.out.println("Enter removed quantity");
        bk.setdecreaseQuantity(sc.nextInt());
        System.out.println(bk.getdecreaseQuantity());
    }
    
    public static int menuList(){
        System.out.println("0.EXIT");
        System.out.println("1.Accept Record");
        System.out.println("2.Print Record");
        System.out.println("3.Increase Quantity");
        System.out.println("4.Decrease Quantity");
        System.out.print("Enter choice");
        return sc.nextInt();
    }

}


 class BookInventory {
    public static void main(String[] args){
        BookTest bkt = new BookTest();
        int choice;
        while ((choice =BookTest.menuList()) !=0){
            switch (choice){
                case 1: bkt.acceptRecord();
                break;
                case 2: bkt.printRecord();
                break;
                case 3: bkt.increaseQuantity();
                break;
                case 4: bkt.decreaseQuantity();
                break;
            }
        }
        
    }
  
}
