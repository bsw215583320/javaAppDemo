import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static Date getNextHour(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, 1);
        date = calendar.getTime();
        return date;
    }
}
