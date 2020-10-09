package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFile {
    FileInputStream fileInput = null;

    public ReadConfigFile() {
        try {
            File file = new File(Constant.CONFIG_PROPERTIES_DIRECTORY);
            fileInput = new FileInputStream(file);
        } catch (Exception e) {
        }
    }

        public String getBrowser() throws IOException {

            Properties prop = new Properties();
            prop.load(fileInput);
            return prop.getProperty("browser");
        }
}
