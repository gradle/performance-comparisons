package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_128 {
    private final Production60_128 production = new Production60_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}