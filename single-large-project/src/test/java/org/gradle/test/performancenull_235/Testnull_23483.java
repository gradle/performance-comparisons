package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23483 {
    private final Productionnull_23483 production = new Productionnull_23483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}