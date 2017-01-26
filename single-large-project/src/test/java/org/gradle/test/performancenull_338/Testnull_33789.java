package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33789 {
    private final Productionnull_33789 production = new Productionnull_33789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}