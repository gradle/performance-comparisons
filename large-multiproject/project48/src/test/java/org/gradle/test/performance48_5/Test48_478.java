package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_478 {
    private final Production48_478 production = new Production48_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}