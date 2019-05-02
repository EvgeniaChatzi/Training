package CoreJava;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d.toString());

//        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
//        System.out.println(timeStamp);

        SimpleDateFormat dfm = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        Date date = new Date();
        System.out.println(dfm.format(d));


    }
}
