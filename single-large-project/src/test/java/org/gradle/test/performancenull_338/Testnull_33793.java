package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33793 {
    private final Productionnull_33793 production = new Productionnull_33793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}