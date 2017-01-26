package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43169 {
    private final Productionnull_43169 production = new Productionnull_43169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}