package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_128 {
    private final Production41_128 production = new Production41_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}