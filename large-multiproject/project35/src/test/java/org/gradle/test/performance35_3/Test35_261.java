package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_261 {
    private final Production35_261 production = new Production35_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}