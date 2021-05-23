package command;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheButtonTest {

    @Test
    public void testSum(){
        assertEquals("button is pressed",TheButton.pressed());
    }

}