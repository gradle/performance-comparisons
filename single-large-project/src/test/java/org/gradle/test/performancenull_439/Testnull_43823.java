package org.gradle.test.performancenull_439;

import static org.junit.Assert.*;

public class Testnull_43823 {
    private final Productionnull_43823 production = new Productionnull_43823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}