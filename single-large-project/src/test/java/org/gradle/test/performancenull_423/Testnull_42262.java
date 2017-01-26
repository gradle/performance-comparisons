package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42262 {
    private final Productionnull_42262 production = new Productionnull_42262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}