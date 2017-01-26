package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41881 {
    private final Productionnull_41881 production = new Productionnull_41881("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}