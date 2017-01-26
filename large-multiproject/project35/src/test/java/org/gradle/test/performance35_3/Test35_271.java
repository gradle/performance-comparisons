package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_271 {
    private final Production35_271 production = new Production35_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}