package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21301 {
    private final Productionnull_21301 production = new Productionnull_21301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}