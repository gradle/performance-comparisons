package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_128 {
    private final Production75_128 production = new Production75_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}