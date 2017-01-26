package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43139 {
    private final Productionnull_43139 production = new Productionnull_43139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}