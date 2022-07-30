package zam.dev;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleTest {


    @Test
    void testLocale() {
    /*
    bahasa dan negara sudah aa representasinya
    kelas locale bisa direperesentasikan untuk negara
    menggunakan bahasa dan negara
     */
        Locale locale = new Locale("id" , "ID");
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());

    }

    @Test
    void testResourceBundle() {
        /*
        resource bundle adalah class yang diguaakan untuk memasukan data yang bisa berubah2 sesuai dengan locale
        yang kita pilih  , data di simpan dalam bentu properties file
         */
        var resourceBundle = ResourceBundle.getBundle("message");
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("godbye"));
    }

    @Test
    void resourceBundlei18n() {

        //untuk menggunakan nya kita bisa menggunakan locale nya
        // java tidak bisa auto translate maka kita harus menyediakan file dengan bahsa indonesia
        //caranya dengan membuat file properties dengan format message_id_ID.properties
        //nama file harus diawali dengan nama depan

        Locale localeIndonesia = new Locale("id" , "ID");
        var resourceBundle = ResourceBundle.getBundle("message" , localeIndonesia);
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("godbye"));

    }
}
