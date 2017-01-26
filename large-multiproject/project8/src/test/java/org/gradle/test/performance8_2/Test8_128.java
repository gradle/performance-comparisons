package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_128 {
    private final Production8_128 production = new Production8_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}