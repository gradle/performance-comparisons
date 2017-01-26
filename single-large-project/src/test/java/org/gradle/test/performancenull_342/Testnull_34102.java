package org.gradle.test.performancenull_342;

import static org.junit.Assert.*;

public class Testnull_34102 {
    private final Productionnull_34102 production = new Productionnull_34102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}