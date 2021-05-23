
import org.junit.Test;
import static org.junit.Assert.*;
public class CoffeeTest{

    @Test
    public void test1(){
        assertEquals("Served",Coffee.serveCoffee());
    }
    @Test
    public void lateTest(){
        assertEquals("late is made",Late.lateComplete());
    }
    @Test
    public void sweetBlackTest(){
        assertEquals("sweetBlack is made",SweetBlack.sweetBlackComplete());
    }



}