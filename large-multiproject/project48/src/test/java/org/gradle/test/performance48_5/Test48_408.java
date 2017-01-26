package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_408 {
    private final Production48_408 production = new Production48_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}