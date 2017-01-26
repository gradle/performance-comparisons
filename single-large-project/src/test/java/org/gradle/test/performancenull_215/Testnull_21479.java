package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21479 {
    private final Productionnull_21479 production = new Productionnull_21479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}