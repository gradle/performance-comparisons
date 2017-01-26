package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31162 {
    private final Productionnull_31162 production = new Productionnull_31162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}