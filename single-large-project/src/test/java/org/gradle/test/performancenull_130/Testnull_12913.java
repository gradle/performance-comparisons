package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12913 {
    private final Productionnull_12913 production = new Productionnull_12913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}