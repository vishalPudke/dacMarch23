import java.util.Scanner;
import java.text.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

 class DateRecord {
    private int day;
    private int month;
    private int year;
    DateRecord(){
        this.day=0;
        this.month=0;
        this.year=0;
    }
    public void setDay(int day){
        this.day=day;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public String getDate(){
    return String.format("%04d/%02d/%02d", getYear(), getMonth(), getDay());
    }
 }
 class DateTest{
    private static Scanner sc = new Scanner(System.in);
     DateRecord dr = new DateRecord();
     int Day = dr.getDay();
     int Month = dr.getMonth();
     int Year = dr.getYear();
    public void acceptRecord(){
        System.out.println("Enter Day");
        dr.setDay(sc.nextInt());
        System.out.println("Enter Month");
        dr.setMonth(sc.nextInt());
        System.out.println("Enter Year");
        dr.setYear(sc.nextInt());     
    }
    public void isValid(){
        int Day = dr.getDay();
        int Month = dr.getMonth();
        int Year = dr.getYear();
        if(Day > 0 && Day <= 31 ){
            if (Month >=0 && Month < 12){
                 if (Year > 1582){
                    System.out.println("Date Is Valid");
                }
              }
            } else{
                System.out.println("Date is Invalid");
            }
    } 

    public void getdayofweek(){
        String DaysofWeek [] ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

    Calendar calendar = Calendar.getInstance();
   
    calendar.set(Year,Month,Day); 
    int dayofweek = calendar.get(Calendar.DAY_OF_WEEK);
    System.out.println(DaysofWeek[dayofweek-3]);
}
   
    public void getNextDay(){
        DateFormat tdf = new SimpleDateFormat("yyyy/MM/dd");
        String str = dr.getDate();
        try{
            java.util.Date date = tdf.parse(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_YEAR,1);
            System.out.println("Next Day is "+tdf.format(calendar.getTime()));
        }
        catch(ParseException e){
            System.out.println("PARSE Exception "+str);
        }
    }   
       

public void getPrevDay(){
        DateFormat tdf = new SimpleDateFormat("yyyy/MM/dd");
        String str = dr.getDate();
        try{
            java.util.Date date = tdf.parse(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_YEAR,-1);
            System.out.println("Next Day is "+tdf.format(calendar.getTime()));
        }
        catch(ParseException e){
            System.out.println("PARSE Exception "+str);
        }
    }
         public void isleapyear(){
            int Year = dr.getYear();
                if ( ( Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0) ){
                    System.out.println("Leap Year");
                }
            else{
                System.out.println("Not a Leap Year");
        }

    }
}

 class Date {
    public static void main (String [] args)throws ParseException{
        DateTest  dt = new DateTest();
        dt.acceptRecord();
        dt.isValid();
        dt.isleapyear();
        dt.getdayofweek();
        dt.getNextDay();
        dt.getPrevDay();
        
    }
    
}
