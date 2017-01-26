package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43248 {
    private final Productionnull_43248 production = new Productionnull_43248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}