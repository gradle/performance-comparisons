package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_397 {
    private final Production35_397 production = new Production35_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}