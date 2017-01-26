package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23248 {
    private final Productionnull_23248 production = new Productionnull_23248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}