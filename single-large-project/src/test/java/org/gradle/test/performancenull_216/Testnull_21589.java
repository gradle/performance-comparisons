package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21589 {
    private final Productionnull_21589 production = new Productionnull_21589("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}