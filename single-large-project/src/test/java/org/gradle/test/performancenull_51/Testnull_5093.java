package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5093 {
    private final Productionnull_5093 production = new Productionnull_5093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}