package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_370 {
    private final Production35_370 production = new Production35_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}