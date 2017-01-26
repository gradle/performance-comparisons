package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28005 {
    private final Productionnull_28005 production = new Productionnull_28005("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}