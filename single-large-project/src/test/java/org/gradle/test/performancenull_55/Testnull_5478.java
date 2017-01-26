package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5478 {
    private final Productionnull_5478 production = new Productionnull_5478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}