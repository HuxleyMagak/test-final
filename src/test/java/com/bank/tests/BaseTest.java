package com.bank.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.bank.factory.DriverFactory;
import com.bank.utils.ConfigReader;

public class BaseTest {
    @BeforeMethod
    public void setup(){
        DriverFactory.initDriver();
        DriverFactory.getDriver().get(ConfigReader.get("base.url"));
    }

    @AfterMethod
    public void teardown(){
        DriverFactory.quitDriver();
    }
}
