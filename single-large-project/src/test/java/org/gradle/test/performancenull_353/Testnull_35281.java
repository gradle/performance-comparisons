package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35281 {
    private final Productionnull_35281 production = new Productionnull_35281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}