package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35932 {
    private final Productionnull_35932 production = new Productionnull_35932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}