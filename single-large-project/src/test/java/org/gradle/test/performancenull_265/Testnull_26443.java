package org.gradle.test.performancenull_265;

import static org.junit.Assert.*;

public class Testnull_26443 {
    private final Productionnull_26443 production = new Productionnull_26443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}