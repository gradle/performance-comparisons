package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43251 {
    private final Productionnull_43251 production = new Productionnull_43251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}