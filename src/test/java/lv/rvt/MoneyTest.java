package lv.rvt;
import rvt.Money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class MoneyTest {
    @Test
    public void testPlusMethode(){
        Money macins1 = new Money(10, 10);
        Money macins2 = new Money(5, 90);
        Money macins3 = macins1.plus(macins2);
        assertEquals(16, macins3.euros());
        assertEquals(0, macins3.cents());
    }
    public void testLessMethode(){
        //assertFalse(macins1.lessThen(macins2));
    }
}
