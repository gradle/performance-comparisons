package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31458 {
    private final Productionnull_31458 production = new Productionnull_31458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}