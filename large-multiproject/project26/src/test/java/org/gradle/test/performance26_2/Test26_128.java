package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_128 {
    private final Production26_128 production = new Production26_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}