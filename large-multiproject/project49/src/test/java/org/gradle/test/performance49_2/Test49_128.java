package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_128 {
    private final Production49_128 production = new Production49_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}