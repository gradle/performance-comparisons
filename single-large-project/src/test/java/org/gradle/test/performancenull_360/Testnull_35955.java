package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35955 {
    private final Productionnull_35955 production = new Productionnull_35955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}