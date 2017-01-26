package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_433 {
    private final Production48_433 production = new Production48_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}