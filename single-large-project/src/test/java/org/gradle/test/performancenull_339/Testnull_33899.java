package org.gradle.test.performancenull_339;

import static org.junit.Assert.*;

public class Testnull_33899 {
    private final Productionnull_33899 production = new Productionnull_33899("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}