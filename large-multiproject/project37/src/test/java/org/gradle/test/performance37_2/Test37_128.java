package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_128 {
    private final Production37_128 production = new Production37_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}