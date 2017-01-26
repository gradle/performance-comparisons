package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_438 {
    private final Production35_438 production = new Production35_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}