package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35983 {
    private final Productionnull_35983 production = new Productionnull_35983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}