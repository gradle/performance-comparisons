package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_128 {
    private final Production89_128 production = new Production89_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}