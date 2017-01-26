package org.gradle.test.performancenull_54;

import static org.junit.Assert.*;

public class Testnull_5309 {
    private final Productionnull_5309 production = new Productionnull_5309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}