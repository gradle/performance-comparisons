package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43127 {
    private final Productionnull_43127 production = new Productionnull_43127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}