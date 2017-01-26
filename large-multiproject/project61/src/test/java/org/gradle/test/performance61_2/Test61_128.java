package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_128 {
    private final Production61_128 production = new Production61_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}