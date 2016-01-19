package in.aqel.sharksdk.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Ahammad on 15/12/15.
 */
public class StringUtils {

    public static String getDateFromBlogString(String dateString){
        try {
            long shift_timezone= (long) (5.5*3600*1000); // shifts from GMT to IST timezone.
            dateString = dateString.substring(0, dateString.length()-6);
            Date dateb = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:sss").parse(dateString);
            return (String) android.text.format.DateUtils.getRelativeTimeSpanString(dateb.getTime() + shift_timezone);

        } catch (ParseException e) {
            e.printStackTrace();
            return "Date not available";
        }
    }

    public static long getTimeLong(String dateString){
        try {
            long shift_timezone= (long) (5.5*3600*1000); // shifts from GMT to IST timezone.
            dateString = dateString.substring(0, dateString.length()-6);
            Date dateb = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:sss").parse(dateString);
            return dateb.getTime();

        } catch (ParseException e) {
            e.printStackTrace();
            return System.currentTimeMillis();
        }
    }
}
