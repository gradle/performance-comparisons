package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5483 {
    private final Productionnull_5483 production = new Productionnull_5483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}