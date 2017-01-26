package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43978 {
    private final Productionnull_43978 production = new Productionnull_43978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}