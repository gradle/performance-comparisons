package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6089 {
    private final Productionnull_6089 production = new Productionnull_6089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}