package org.gradle.test.performancenull_389;

import static org.junit.Assert.*;

public class Testnull_38873 {
    private final Productionnull_38873 production = new Productionnull_38873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}