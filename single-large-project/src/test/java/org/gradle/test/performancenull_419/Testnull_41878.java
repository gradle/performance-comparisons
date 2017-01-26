package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41878 {
    private final Productionnull_41878 production = new Productionnull_41878("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}