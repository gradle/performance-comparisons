package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25097 {
    private final Productionnull_25097 production = new Productionnull_25097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}