package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34955 {
    private final Productionnull_34955 production = new Productionnull_34955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}