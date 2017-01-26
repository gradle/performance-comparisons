package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_128 {
    private final Production31_128 production = new Production31_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}