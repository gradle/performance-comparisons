package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43203 {
    private final Productionnull_43203 production = new Productionnull_43203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}