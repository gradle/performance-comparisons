package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6076 {
    private final Productionnull_6076 production = new Productionnull_6076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}