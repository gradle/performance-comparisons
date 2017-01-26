package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_128 {
    private final Production83_128 production = new Production83_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}