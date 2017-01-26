package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33785 {
    private final Productionnull_33785 production = new Productionnull_33785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}