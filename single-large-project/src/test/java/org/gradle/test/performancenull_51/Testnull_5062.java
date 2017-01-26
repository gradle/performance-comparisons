package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5062 {
    private final Productionnull_5062 production = new Productionnull_5062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}