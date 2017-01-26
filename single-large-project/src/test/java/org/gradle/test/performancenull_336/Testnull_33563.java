package org.gradle.test.performancenull_336;

import static org.junit.Assert.*;

public class Testnull_33563 {
    private final Productionnull_33563 production = new Productionnull_33563("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}