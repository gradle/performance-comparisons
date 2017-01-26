package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28027 {
    private final Productionnull_28027 production = new Productionnull_28027("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}