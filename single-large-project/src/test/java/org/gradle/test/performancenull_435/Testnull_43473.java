package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43473 {
    private final Productionnull_43473 production = new Productionnull_43473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}