package command;

import org.junit.Test;

import static org.junit.Assert.*;

public class TvRecieverTest {
    @Test
    public void testReciever(){
        assertEquals("signal recieved",TvReciever.recieved());
    }


}