package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testMultiply() {
        App app = new App();
        assertEquals(6, app.multiply(2, 3));
    }
}
