package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_128 {
    private final Production21_128 production = new Production21_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}