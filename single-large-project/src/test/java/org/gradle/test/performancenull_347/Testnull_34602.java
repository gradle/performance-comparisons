package org.gradle.test.performancenull_347;

import static org.junit.Assert.*;

public class Testnull_34602 {
    private final Productionnull_34602 production = new Productionnull_34602("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}