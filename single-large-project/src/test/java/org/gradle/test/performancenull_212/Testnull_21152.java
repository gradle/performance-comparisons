package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21152 {
    private final Productionnull_21152 production = new Productionnull_21152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}