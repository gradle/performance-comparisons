package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_128 {
    private final Production18_128 production = new Production18_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}