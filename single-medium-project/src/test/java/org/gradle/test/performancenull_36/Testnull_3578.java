package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3578 {
    private final Productionnull_3578 production = new Productionnull_3578("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}