package org.gradle.test.performancenull_186;

import static org.junit.Assert.*;

public class Testnull_18563 {
    private final Productionnull_18563 production = new Productionnull_18563("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}