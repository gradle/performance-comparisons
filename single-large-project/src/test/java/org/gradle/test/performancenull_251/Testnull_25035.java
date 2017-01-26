package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25035 {
    private final Productionnull_25035 production = new Productionnull_25035("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}