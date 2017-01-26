package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3135 {
    private final Productionnull_3135 production = new Productionnull_3135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}