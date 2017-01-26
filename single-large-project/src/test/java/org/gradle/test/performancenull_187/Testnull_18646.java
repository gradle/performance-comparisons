package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18646 {
    private final Productionnull_18646 production = new Productionnull_18646("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}