package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31281 {
    private final Productionnull_31281 production = new Productionnull_31281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}