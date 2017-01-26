package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_128 {
    private final Production72_128 production = new Production72_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}