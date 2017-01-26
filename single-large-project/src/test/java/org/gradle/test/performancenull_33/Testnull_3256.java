package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3256 {
    private final Productionnull_3256 production = new Productionnull_3256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}