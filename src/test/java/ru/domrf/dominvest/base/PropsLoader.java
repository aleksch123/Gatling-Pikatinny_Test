package ru.domrf.dominvest.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropsLoader {
    private static   Properties properties = new Properties();
    public static Properties init(String path){
        try {
            properties.load(new FileReader(new File(path)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;

    }
}
