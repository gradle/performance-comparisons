package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34484 {
    private final Productionnull_34484 production = new Productionnull_34484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}