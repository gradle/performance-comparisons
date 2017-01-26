package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33229 {
    private final Productionnull_33229 production = new Productionnull_33229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}