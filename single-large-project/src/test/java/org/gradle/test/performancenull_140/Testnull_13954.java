package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13954 {
    private final Productionnull_13954 production = new Productionnull_13954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}