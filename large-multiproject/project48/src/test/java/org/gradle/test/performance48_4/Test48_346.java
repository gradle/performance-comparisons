package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_346 {
    private final Production48_346 production = new Production48_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}