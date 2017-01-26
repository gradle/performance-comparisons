package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_236 {
    private final Production8_236 production = new Production8_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}