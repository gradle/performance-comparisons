package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13482 {
    private final Productionnull_13482 production = new Productionnull_13482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}