package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34948 {
    private final Productionnull_34948 production = new Productionnull_34948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}