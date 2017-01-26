package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_128 {
    private final Production92_128 production = new Production92_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}