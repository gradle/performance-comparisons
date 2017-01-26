package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_128 {
    private final Production80_128 production = new Production80_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}