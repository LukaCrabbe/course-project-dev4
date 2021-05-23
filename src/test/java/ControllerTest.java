import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTest {

    @Test
    public void lightTest(){
        assertEquals("ligt works",Light.lightInput());
    }


    @Test
    public void testSum(){
        assertEquals("button is pressed",TheButton.pressed());
    }


    @Test
    public void controlerTest(){
        assertEquals("connection made",TvControler.recieved());
    }


    @Test
    public void testReciever(){
        assertEquals("signal recieved",TvReciever.recieved());
    }


}