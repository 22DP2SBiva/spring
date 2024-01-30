package lv.rvt;
import rvt.Money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
    @Test
    public void testLessMethode(){
        Money macins1 = new Money(10, 10);
        Money macins2 = new Money(5, 90);
        assertFalse(macins1.lessThan(macins2));
        assertTrue(macins2.lessThan(macins1));
    } 
    @Test
    public void testMinusMethode(){
        Money macins1 = new Money(5, 10);
        Money macins2 = new Money(6, 0);
        Money macins3 = macins1.minus(macins2);
        Money macins4 = macins2.minus(macins1);
        assertEquals(0, macins3.euros()); assertEquals(0, macins3.cents());
        assertEquals(0, macins4.euros()); assertEquals(90, macins4.cents());
    }
}
