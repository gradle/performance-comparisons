package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_346 {
    private final Production35_346 production = new Production35_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}