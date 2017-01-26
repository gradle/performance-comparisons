package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5045 {
    private final Productionnull_5045 production = new Productionnull_5045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}