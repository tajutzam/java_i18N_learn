package zam.dev;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Locale;

public class NumberFormat {


    @Test
    void numberFormat() {

        //kenapa hasil koma ? karena kita mengikuti default dari bahasa di laptop
        var numberFormat = java.text.NumberFormat.getInstance();
        var format =numberFormat.format(100000);
        System.out.println(format);

    }

    @Test
    void numberFormatIndonesia() {

        Locale localeIndonesia = new Locale("id" , "ID");
        var numberFormat = java.text.NumberFormat.getInstance(localeIndonesia);
        var format =numberFormat.format(100000);
        System.out.println(format);

    }
    @Test
    void numberFormatParseIndonesia() throws ParseException {

        Locale localeIndonesia = new Locale("id" , "ID");
        var numberFormat = java.text.NumberFormat.getInstance(localeIndonesia);
        var format =numberFormat.format(100000);
        var result = numberFormat.parse(format);
        System.out.println(result);

    }
}
