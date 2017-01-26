package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12932 {
    private final Productionnull_12932 production = new Productionnull_12932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}