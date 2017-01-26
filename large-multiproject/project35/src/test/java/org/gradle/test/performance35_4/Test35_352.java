package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_352 {
    private final Production35_352 production = new Production35_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}