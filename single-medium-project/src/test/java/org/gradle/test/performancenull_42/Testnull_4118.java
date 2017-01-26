package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4118 {
    private final Productionnull_4118 production = new Productionnull_4118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}