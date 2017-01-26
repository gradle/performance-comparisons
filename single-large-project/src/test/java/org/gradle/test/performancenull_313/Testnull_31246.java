package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31246 {
    private final Productionnull_31246 production = new Productionnull_31246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}