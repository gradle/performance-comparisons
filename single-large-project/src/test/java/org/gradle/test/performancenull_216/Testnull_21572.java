package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21572 {
    private final Productionnull_21572 production = new Productionnull_21572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}