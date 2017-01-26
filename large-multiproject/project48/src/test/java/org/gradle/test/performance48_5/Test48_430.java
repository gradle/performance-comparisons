package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_430 {
    private final Production48_430 production = new Production48_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}