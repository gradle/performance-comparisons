package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_128 {
    private final Production30_128 production = new Production30_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}