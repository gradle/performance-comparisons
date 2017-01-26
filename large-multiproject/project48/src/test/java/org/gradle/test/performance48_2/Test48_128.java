package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_128 {
    private final Production48_128 production = new Production48_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}