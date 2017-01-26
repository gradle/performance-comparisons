package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_397 {
    private final Production48_397 production = new Production48_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}