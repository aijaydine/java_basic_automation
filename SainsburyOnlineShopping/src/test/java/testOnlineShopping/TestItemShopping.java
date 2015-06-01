package testOnlineShopping;

import onlineShopping.ItemShopping;
import org.junit.Test;


/**
 * Created by AIJAY on 31/05/2015.
 */
public class TestItemShopping {
    ItemShopping test = new ItemShopping("bread");

    @Test
    public void runTest(){
        test.setUp();
        test.shopItem();
        test.confirmItem();
        test.tearDown();
    }
}
