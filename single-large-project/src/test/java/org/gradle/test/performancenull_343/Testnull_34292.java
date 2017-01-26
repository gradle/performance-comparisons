package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34292 {
    private final Productionnull_34292 production = new Productionnull_34292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}