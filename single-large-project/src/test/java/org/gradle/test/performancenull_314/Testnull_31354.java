package org.gradle.test.performancenull_314;

import static org.junit.Assert.*;

public class Testnull_31354 {
    private final Productionnull_31354 production = new Productionnull_31354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}