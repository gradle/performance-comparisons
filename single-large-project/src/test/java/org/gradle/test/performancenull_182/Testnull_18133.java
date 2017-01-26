package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18133 {
    private final Productionnull_18133 production = new Productionnull_18133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}