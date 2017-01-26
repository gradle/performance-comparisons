package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43293 {
    private final Productionnull_43293 production = new Productionnull_43293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}