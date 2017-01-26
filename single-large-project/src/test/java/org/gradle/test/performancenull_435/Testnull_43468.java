package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43468 {
    private final Productionnull_43468 production = new Productionnull_43468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}