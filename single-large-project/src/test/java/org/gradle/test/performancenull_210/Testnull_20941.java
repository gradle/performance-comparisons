package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20941 {
    private final Productionnull_20941 production = new Productionnull_20941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}