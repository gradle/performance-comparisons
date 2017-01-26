package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_493 {
    private final Production48_493 production = new Production48_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}