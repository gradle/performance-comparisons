package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_463 {
    private final Production35_463 production = new Production35_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}