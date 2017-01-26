package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40379 {
    private final Productionnull_40379 production = new Productionnull_40379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}