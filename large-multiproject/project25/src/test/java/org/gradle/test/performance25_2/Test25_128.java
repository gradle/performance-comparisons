package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_128 {
    private final Production25_128 production = new Production25_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}