package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42213 {
    private final Productionnull_42213 production = new Productionnull_42213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}