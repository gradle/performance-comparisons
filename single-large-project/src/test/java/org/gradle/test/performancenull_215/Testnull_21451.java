package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21451 {
    private final Productionnull_21451 production = new Productionnull_21451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}