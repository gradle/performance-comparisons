package org.gradle.test.performancenull_438;

import static org.junit.Assert.*;

public class Testnull_43793 {
    private final Productionnull_43793 production = new Productionnull_43793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}