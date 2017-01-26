package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25476 {
    private final Productionnull_25476 production = new Productionnull_25476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}