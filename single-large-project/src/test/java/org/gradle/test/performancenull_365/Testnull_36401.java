package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36401 {
    private final Productionnull_36401 production = new Productionnull_36401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}