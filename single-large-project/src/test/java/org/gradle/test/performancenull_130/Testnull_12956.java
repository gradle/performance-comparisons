package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12956 {
    private final Productionnull_12956 production = new Productionnull_12956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}