package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23032 {
    private final Productionnull_23032 production = new Productionnull_23032("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}