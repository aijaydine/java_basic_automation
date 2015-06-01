package testOnlineShopping;

import onlineShopping.RegisterUser;
import org.junit.Test;

/**
 * Created by AIJAY on 31/05/2015.
 */
public class TestRegisterUser {
    RegisterUser test = new RegisterUser("Aijay","Dine", "dine@yahoo.com" , "12345abc");

   @Test

    public void setTest(){
       test.setUp();
       test.setUser();
       test.confirmUser();
       test.tearDown();

   }
}
