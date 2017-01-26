package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_366 {
    private final Production48_366 production = new Production48_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}