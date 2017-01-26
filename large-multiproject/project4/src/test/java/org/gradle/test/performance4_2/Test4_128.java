package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_128 {
    private final Production4_128 production = new Production4_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}