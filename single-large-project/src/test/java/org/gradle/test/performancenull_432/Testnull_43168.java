package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43168 {
    private final Productionnull_43168 production = new Productionnull_43168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}