package com.bank.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.File;

import javax.imageio.stream.FileImageInputStream;

public class ConfigReader {
    private static Properties props;

    static{
        try{
            props = new Properties();
            FileInputStream fis = new FileInputStream("src/main/java/resources/config.properties");
            props.load(fis);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String get(String key){
      return props.getProperty(key);
    }
}
