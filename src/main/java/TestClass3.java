import java.text.SimpleDateFormat;
import java.util.Date;

public class TestClass3 {
    public static void main(String[] args) {

        System.out.println("This class is from test 1 branch...");
        System.out.println(UtilityClass.getCurrentDateTime1());
        System.out.println(UtilityClass.getCurrentDateTime2());
        System.out.println(new SimpleDateFormat("EEEddMMyyyy_hh-mm-ss").format(new Date()));
    }
}
