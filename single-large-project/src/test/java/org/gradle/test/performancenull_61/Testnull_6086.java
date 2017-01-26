package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6086 {
    private final Productionnull_6086 production = new Productionnull_6086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}