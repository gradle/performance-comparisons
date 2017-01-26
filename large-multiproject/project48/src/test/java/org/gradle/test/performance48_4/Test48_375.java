package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_375 {
    private final Production48_375 production = new Production48_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}