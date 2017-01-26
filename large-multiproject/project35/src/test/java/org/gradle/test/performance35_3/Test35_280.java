package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_280 {
    private final Production35_280 production = new Production35_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}