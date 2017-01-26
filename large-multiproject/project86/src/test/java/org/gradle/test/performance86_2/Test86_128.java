package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_128 {
    private final Production86_128 production = new Production86_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}