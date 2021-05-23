package command;

import org.junit.Test;

import static org.junit.Assert.*;

public class TvControlerTest {

    @Test
    public void controlerTest(){
        assertEquals("connection made",TvControler.recieved());
    }

}