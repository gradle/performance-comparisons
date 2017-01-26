package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_128 {
    private final Production74_128 production = new Production74_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}