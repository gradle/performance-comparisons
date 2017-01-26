package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33258 {
    private final Productionnull_33258 production = new Productionnull_33258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}