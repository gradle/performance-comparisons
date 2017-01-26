package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_279 {
    private final Production35_279 production = new Production35_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}