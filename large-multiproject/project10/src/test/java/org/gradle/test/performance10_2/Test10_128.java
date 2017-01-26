package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_128 {
    private final Production10_128 production = new Production10_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}