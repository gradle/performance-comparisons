package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_375 {
    private final Production35_375 production = new Production35_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}