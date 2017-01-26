package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43472 {
    private final Productionnull_43472 production = new Productionnull_43472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}