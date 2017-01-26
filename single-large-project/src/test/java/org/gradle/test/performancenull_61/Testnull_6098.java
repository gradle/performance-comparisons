package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6098 {
    private final Productionnull_6098 production = new Productionnull_6098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}