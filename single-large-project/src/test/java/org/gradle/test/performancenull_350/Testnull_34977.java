package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34977 {
    private final Productionnull_34977 production = new Productionnull_34977("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}