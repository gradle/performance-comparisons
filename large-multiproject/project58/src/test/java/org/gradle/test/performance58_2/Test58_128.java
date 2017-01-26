package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_128 {
    private final Production58_128 production = new Production58_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}