package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22485 {
    private final Productionnull_22485 production = new Productionnull_22485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}