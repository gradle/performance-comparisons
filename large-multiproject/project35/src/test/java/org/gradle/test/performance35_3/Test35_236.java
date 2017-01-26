package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_236 {
    private final Production35_236 production = new Production35_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}