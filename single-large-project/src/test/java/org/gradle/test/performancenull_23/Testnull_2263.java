package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2263 {
    private final Productionnull_2263 production = new Productionnull_2263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}