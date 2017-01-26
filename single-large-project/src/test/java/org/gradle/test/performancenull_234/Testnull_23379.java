package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23379 {
    private final Productionnull_23379 production = new Productionnull_23379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}