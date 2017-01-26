package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3300 {
    private final Productionnull_3300 production = new Productionnull_3300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}