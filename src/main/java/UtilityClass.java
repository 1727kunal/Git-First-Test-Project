import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilityClass {

    public static void waitFor(long miliSeconds){
        try {
            Thread.sleep(miliSeconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getCurrentDateTime1(){
        Date d1 = new Date();
        String currentDateTime = String.valueOf(d1);
        String year = currentDateTime.substring(currentDateTime.length()-4);
        String day =  currentDateTime.substring(0,3);
        String month = currentDateTime.substring(4,7);
        String date = currentDateTime.substring(8,10);
        String time = currentDateTime.substring(11,19);
        time = time.replace(':','-');
        return day+date+month+year+time;
    }

    public static String getCurrentDateTime2(){
        return new SimpleDateFormat("EEEddMMMyyyy_hh-mm-ss").format(new Date());
    }
}
