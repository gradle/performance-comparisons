package org.gradle.test.performancenull_339;

import static org.junit.Assert.*;

public class Testnull_33873 {
    private final Productionnull_33873 production = new Productionnull_33873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}