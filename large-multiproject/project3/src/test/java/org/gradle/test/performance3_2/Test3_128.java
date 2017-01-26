package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_128 {
    private final Production3_128 production = new Production3_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}