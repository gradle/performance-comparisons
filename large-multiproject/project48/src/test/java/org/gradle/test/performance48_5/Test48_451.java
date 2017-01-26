package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_451 {
    private final Production48_451 production = new Production48_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}