package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5097 {
    private final Productionnull_5097 production = new Productionnull_5097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}