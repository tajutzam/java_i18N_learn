package zam.dev;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    @Test
    void testDateFormat() {

        var dateFormat = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm");
        var format = dateFormat.format(new Date());
        System.out.println(format);

    }
    @Test
    void testDateFormatIndonesia() {

        Locale indonesia = new Locale("id" , "ID");
        var dateFormat = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm" , indonesia);
        var format = dateFormat.format(new Date());
        System.out.println(format);

    }


}
