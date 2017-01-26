package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_439 {
    private final Production48_439 production = new Production48_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}