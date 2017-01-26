package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23086 {
    private final Productionnull_23086 production = new Productionnull_23086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}