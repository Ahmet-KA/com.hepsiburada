package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationsReader {

    static Properties properties;


    static {

        String dosyaYolu = "src/Configurations.properties";

        try{
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fileInputStream);

        } catch(IOException e){

            System.out.println("Dosya okunamadı..");
        }
    }

    public static String getProperty(String key){

        return properties.getProperty(key);
    }
}
