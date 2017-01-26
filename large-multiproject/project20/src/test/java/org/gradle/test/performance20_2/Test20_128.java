package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_128 {
    private final Production20_128 production = new Production20_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}