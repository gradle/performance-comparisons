package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_494 {
    private final Production48_494 production = new Production48_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}