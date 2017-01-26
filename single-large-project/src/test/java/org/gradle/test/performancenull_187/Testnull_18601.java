package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18601 {
    private final Productionnull_18601 production = new Productionnull_18601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}