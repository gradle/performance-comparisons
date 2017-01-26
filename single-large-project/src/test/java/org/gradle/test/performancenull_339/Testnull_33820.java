package org.gradle.test.performancenull_339;

import static org.junit.Assert.*;

public class Testnull_33820 {
    private final Productionnull_33820 production = new Productionnull_33820("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}