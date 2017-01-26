package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_128 {
    private final Production55_128 production = new Production55_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}