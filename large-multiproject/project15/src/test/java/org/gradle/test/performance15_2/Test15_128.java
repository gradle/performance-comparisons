package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_128 {
    private final Production15_128 production = new Production15_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}