package zam.dev;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurencyTest {

    @Test
    void curencyTest() {
        //pada curency yang hanya perlu di masukan adalah country
        Locale localeIndonesia = new Locale("id", "ID");
        Currency currency = Currency.getInstance(localeIndonesia);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getSymbol());
    }

    @Test
    void currencyNumberFormat() {
        //menggunakan getCurrencyInstance
        Locale localeIndonesia = new Locale("id" , "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeIndonesia);
        var format = numberFormat.format(1000000);
        System.out.println(format);
    }
    @Test
    void currencyNumberFormatParse() throws ParseException {
        //menggunakan getCurrencyInstance
        Locale localeIndonesia = new Locale("id" , "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeIndonesia);
        var format = numberFormat.format(1000000);
        var result = numberFormat.parse(format);
        System.out.println(result);
    }
}
