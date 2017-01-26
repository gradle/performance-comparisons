package org.gradle.test.performancenull_332;

import static org.junit.Assert.*;

public class Testnull_33102 {
    private final Productionnull_33102 production = new Productionnull_33102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}