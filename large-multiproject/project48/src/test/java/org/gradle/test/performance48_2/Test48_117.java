package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_117 {
    private final Production48_117 production = new Production48_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}