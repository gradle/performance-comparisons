package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35917 {
    private final Productionnull_35917 production = new Productionnull_35917("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}