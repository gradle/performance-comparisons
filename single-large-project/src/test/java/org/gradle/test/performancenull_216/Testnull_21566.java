package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21566 {
    private final Productionnull_21566 production = new Productionnull_21566("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}