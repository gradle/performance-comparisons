package org.gradle.test.performancenull_352;

import static org.junit.Assert.*;

public class Testnull_35121 {
    private final Productionnull_35121 production = new Productionnull_35121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}