package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_128 {
    private final Production84_128 production = new Production84_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}