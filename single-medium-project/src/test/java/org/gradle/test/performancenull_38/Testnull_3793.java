package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3793 {
    private final Productionnull_3793 production = new Productionnull_3793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}