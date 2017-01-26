package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_128 {
    private final Production88_128 production = new Production88_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}