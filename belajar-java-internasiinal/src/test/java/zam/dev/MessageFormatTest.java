package zam.dev;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {
    
    /*
    ketika kita ingin melakukan internasionalisasi kita terkadang membutuhkan data dinamic
    ketika menggunakan resource bundle maka kita perlu memotong resource bundlenya
    untungnya di java ada class messageformat
    meessage formate digunakan untuk subtitusi data pada parameter
    namun data awalnya perlu di tambahkan di parameter

    ------
    parameter di message format
    menggunakan {} dimulai dengan indek 0
    contoh
    hi{0} selamat datang di {1}
     */

    @Test
    void testMessageFormat() {

        String pattern = "hi {0} selamat datang di {1}";
        MessageFormat messageFormat = new MessageFormat(pattern);
        String format = messageFormat.format(new Object[]{
                "Zam" , "Tugazpedia"
        });
        System.out.println(format);
    }

    @Test
    void testMessageFormatResouceBundle() {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
        var pattern = resourceBundle.getString("welcome");
        MessageFormat messageFormat = new MessageFormat(pattern);
        String format = messageFormat.format(new Object[]{
                "Zam" , "Tugazpedia"
        });
        System.out.println(format);
    }

    @Test
    void testMessageformateType() {

        // parameter
        // {argumenindek , formatType , formatStyle}

        // fotmat type
        /*
        number , date , time , choise
         */
        // format style
        /*
        short  , long , integer , full , currency , percent
         */

        Locale localeIndonesia = new Locale("id" , "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message" ,localeIndonesia);
        String pattern = resourceBundle.getString("status");
        MessageFormat messageFormat = new MessageFormat(pattern,localeIndonesia);
        var result = messageFormat.format(new Object[]{
                "zam" , new Date(), 1000000
        });
        System.out.println(result);
    }
}
