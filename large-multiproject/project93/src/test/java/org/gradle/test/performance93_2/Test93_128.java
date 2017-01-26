package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_128 {
    private final Production93_128 production = new Production93_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}