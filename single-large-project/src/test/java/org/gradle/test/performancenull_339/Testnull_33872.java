package org.gradle.test.performancenull_339;

import static org.junit.Assert.*;

public class Testnull_33872 {
    private final Productionnull_33872 production = new Productionnull_33872("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}