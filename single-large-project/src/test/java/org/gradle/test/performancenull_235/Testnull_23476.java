package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23476 {
    private final Productionnull_23476 production = new Productionnull_23476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}