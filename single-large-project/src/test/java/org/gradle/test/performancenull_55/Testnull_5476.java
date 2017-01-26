package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5476 {
    private final Productionnull_5476 production = new Productionnull_5476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}