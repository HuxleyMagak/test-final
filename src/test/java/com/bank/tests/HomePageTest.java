package com.bank.tests;

import org.testng.annotations.Test;
import com.bank.pages.HomePage;
public class HomePageTest extends BaseTest {
    @Test

    public void verifyLogin(){
        HomePage homepage = new HomePage();

        homepage.typeUsername();
        homepage.typePassword();
        homepage.clickLogin();
    }
}
