package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_245 {
    private final Production35_245 production = new Production35_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}