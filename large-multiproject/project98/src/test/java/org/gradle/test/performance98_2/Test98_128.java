package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_128 {
    private final Production98_128 production = new Production98_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}