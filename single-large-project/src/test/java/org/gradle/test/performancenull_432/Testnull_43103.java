package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43103 {
    private final Productionnull_43103 production = new Productionnull_43103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}