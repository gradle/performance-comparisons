package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_262 {
    private final Production48_262 production = new Production48_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}