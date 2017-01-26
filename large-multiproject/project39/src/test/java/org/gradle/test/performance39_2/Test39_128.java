package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_128 {
    private final Production39_128 production = new Production39_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}