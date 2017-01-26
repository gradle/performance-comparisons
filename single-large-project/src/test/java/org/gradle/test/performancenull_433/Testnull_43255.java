package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43255 {
    private final Productionnull_43255 production = new Productionnull_43255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}