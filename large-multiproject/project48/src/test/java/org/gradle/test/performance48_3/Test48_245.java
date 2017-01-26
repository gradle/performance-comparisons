package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_245 {
    private final Production48_245 production = new Production48_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}