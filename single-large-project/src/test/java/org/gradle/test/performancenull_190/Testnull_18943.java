package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18943 {
    private final Productionnull_18943 production = new Productionnull_18943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}