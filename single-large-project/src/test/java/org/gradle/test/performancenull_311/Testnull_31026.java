package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31026 {
    private final Productionnull_31026 production = new Productionnull_31026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}