package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21529 {
    private final Productionnull_21529 production = new Productionnull_21529("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}