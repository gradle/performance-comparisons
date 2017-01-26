package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38443 {
    private final Productionnull_38443 production = new Productionnull_38443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}