package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43475 {
    private final Productionnull_43475 production = new Productionnull_43475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}