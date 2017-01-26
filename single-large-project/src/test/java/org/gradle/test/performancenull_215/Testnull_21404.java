package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21404 {
    private final Productionnull_21404 production = new Productionnull_21404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}