package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_128 {
    private final Production12_128 production = new Production12_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}