package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_383 {
    private final Production48_383 production = new Production48_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}