package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35941 {
    private final Productionnull_35941 production = new Productionnull_35941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}