package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40521 {
    private final Productionnull_40521 production = new Productionnull_40521("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}