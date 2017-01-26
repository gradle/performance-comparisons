package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33761 {
    private final Productionnull_33761 production = new Productionnull_33761("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}