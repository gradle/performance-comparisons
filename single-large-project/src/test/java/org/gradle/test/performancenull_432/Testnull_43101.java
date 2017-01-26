package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43101 {
    private final Productionnull_43101 production = new Productionnull_43101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}