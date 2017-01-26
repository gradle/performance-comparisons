package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43268 {
    private final Productionnull_43268 production = new Productionnull_43268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}