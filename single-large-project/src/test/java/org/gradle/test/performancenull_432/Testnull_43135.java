package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43135 {
    private final Productionnull_43135 production = new Productionnull_43135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}