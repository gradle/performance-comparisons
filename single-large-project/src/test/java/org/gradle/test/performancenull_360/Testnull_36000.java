package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_36000 {
    private final Productionnull_36000 production = new Productionnull_36000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}