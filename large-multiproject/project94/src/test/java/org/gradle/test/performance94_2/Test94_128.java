package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_128 {
    private final Production94_128 production = new Production94_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}