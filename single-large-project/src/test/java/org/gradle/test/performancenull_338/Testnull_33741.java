package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33741 {
    private final Productionnull_33741 production = new Productionnull_33741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}