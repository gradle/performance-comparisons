package org.gradle.test.performancenull_438;

import static org.junit.Assert.*;

public class Testnull_43782 {
    private final Productionnull_43782 production = new Productionnull_43782("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}