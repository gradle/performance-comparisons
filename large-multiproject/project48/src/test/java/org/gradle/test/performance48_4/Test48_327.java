package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_327 {
    private final Production48_327 production = new Production48_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}