package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_402 {
    private final Production48_402 production = new Production48_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}