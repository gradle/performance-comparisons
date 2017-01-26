package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25077 {
    private final Productionnull_25077 production = new Productionnull_25077("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}