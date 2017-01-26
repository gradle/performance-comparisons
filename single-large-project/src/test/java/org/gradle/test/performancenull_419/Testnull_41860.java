package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41860 {
    private final Productionnull_41860 production = new Productionnull_41860("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}