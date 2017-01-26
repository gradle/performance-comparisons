package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23409 {
    private final Productionnull_23409 production = new Productionnull_23409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}