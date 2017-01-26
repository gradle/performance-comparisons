package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43144 {
    private final Productionnull_43144 production = new Productionnull_43144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}