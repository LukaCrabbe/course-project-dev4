import junit.framework.TestCase;
import org.junit.Test;

public class CoffeeTest extends TestCase {

    @Test
    public void test1(){
        assertEquals("Served",Coffee.serveCoffee());
    }

}