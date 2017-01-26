package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33941 {
    private final Productionnull_33941 production = new Productionnull_33941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}