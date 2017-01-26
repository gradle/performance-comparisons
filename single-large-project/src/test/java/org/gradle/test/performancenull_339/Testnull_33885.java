package org.gradle.test.performancenull_339;

import static org.junit.Assert.*;

public class Testnull_33885 {
    private final Productionnull_33885 production = new Productionnull_33885("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}