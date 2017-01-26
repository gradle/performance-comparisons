package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43141 {
    private final Productionnull_43141 production = new Productionnull_43141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}