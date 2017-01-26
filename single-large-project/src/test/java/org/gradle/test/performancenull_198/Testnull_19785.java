package org.gradle.test.performancenull_198;

import static org.junit.Assert.*;

public class Testnull_19785 {
    private final Productionnull_19785 production = new Productionnull_19785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}