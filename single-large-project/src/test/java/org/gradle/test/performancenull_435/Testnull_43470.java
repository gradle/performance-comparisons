package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43470 {
    private final Productionnull_43470 production = new Productionnull_43470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}