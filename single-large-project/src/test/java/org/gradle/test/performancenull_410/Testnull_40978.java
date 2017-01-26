package org.gradle.test.performancenull_410;

import static org.junit.Assert.*;

public class Testnull_40978 {
    private final Productionnull_40978 production = new Productionnull_40978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}