package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_123 {
    private final Production48_123 production = new Production48_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}