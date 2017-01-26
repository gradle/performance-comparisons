package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43122 {
    private final Productionnull_43122 production = new Productionnull_43122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}