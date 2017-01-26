package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38448 {
    private final Productionnull_38448 production = new Productionnull_38448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}