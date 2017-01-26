package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23098 {
    private final Productionnull_23098 production = new Productionnull_23098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}