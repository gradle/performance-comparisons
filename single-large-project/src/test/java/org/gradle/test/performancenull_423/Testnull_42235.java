package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42235 {
    private final Productionnull_42235 production = new Productionnull_42235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}