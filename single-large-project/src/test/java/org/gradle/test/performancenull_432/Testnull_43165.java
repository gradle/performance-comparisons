package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43165 {
    private final Productionnull_43165 production = new Productionnull_43165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}