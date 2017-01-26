package org.gradle.test.performancenull_336;

import static org.junit.Assert.*;

public class Testnull_33585 {
    private final Productionnull_33585 production = new Productionnull_33585("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}