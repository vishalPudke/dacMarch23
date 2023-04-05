import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
class DateRecord{
    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;
    private int second;
   
    DateRecord(){
        this.day=0;
        this.month=0;
        this.year=0;
        this.hour=0;
        this.minute=0;
        this.second=0;
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
    public void setHour(int hour){
        this.hour=hour;
    }
    public void setMinute(int minute){
        this.minute=minute;
    }
    public void setSecond(int second){
        this.second=second;
    }
    public String getDate(){
        return  this.day+"/"+this.month+"/"+this.year;
    } 
    public String getTime(){
        return this.hour+":"+this.minute+":"+this.second;
    }
   
}
class TestDate{
    private static Scanner sc = new Scanner(System.in);
         DateRecord d = new DateRecord();
         public void acceptDateTimeRecord(){
        System.out.println("Enter DATE dd mm yyyy");
        d.setDay(sc.nextInt());
        d.setMonth(sc.nextInt());
        d.setYear(sc.nextInt());
        System.out.println("Enter TIME hh:mm:ss");
        d.setHour(sc.nextInt());
        d.setMinute(sc.nextInt());
        d.setSecond(sc.nextInt());
    }
    public void printDateTimeRecord() throws ParseException{
        String str = d.getDate();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date = df.parse(str);
        DateFormat dof = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat dof1 = new SimpleDateFormat("MM/dd/yyyy");
        DateFormat dof2 = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("DATE FORMAT");
        System.out.println(dof.format(date));
        System.out.println(dof1.format(date));
        System.out.println(dof2.format(date));
        String string = d.getTime();
        DateFormat tf = new SimpleDateFormat("hh:mm:ss");
        Date time = tf.parse(string);
        DateFormat tof = new SimpleDateFormat("HH:mm:ss ");
        DateFormat tof1 = new SimpleDateFormat("hh:mm:ss ");
        DateFormat tof2 = new SimpleDateFormat("hh:mm");
        System.out.println("TIME FORMAT");
        System.out.println(tof.format(time));
        System.out.println(tof1.format(time));
        System.out.println(tof2.format(time));

        String dateTime = str+" "+string;
        DateFormat tdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date datetime = tdf.parse(dateTime);
        DateFormat tdof = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        DateFormat tdof1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        DateFormat tdof2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println("DATE & TIME FORMAT");
        System.out.println(tdof.format(datetime));
        System.out.println(tdof1.format(datetime));
        System.out.println(tdof2.format(datetime));
    }
}
class AcceptDateTime{
    public static void main(String [] args)throws ParseException{
        TestDate td = new TestDate();
        td.acceptDateTimeRecord();
        td.printDateTimeRecord();

    }
}
