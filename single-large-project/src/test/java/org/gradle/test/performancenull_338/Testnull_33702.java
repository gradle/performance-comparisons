package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33702 {
    private final Productionnull_33702 production = new Productionnull_33702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}