package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_463 {
    private final Production48_463 production = new Production48_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}