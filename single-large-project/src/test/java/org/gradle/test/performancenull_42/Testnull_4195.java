package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4195 {
    private final Productionnull_4195 production = new Productionnull_4195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}