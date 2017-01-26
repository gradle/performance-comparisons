package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25480 {
    private final Productionnull_25480 production = new Productionnull_25480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}