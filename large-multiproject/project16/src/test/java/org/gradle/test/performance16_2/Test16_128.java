package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_128 {
    private final Production16_128 production = new Production16_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}