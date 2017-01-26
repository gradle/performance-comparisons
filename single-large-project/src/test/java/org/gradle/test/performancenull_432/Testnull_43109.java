package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43109 {
    private final Productionnull_43109 production = new Productionnull_43109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}