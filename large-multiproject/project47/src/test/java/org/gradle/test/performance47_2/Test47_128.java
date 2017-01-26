package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_128 {
    private final Production47_128 production = new Production47_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}