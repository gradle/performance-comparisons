package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_128 {
    private final Production43_128 production = new Production43_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}