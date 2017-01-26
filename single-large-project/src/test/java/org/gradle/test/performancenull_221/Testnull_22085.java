package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22085 {
    private final Productionnull_22085 production = new Productionnull_22085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}