package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43163 {
    private final Productionnull_43163 production = new Productionnull_43163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}