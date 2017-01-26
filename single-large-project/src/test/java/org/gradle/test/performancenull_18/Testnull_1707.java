package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1707 {
    private final Productionnull_1707 production = new Productionnull_1707("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}