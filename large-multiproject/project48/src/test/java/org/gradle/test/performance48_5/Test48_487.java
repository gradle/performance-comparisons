package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_487 {
    private final Production48_487 production = new Production48_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}