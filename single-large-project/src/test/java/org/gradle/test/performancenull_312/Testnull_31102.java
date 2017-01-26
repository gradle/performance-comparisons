package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31102 {
    private final Productionnull_31102 production = new Productionnull_31102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}