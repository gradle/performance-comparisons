package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21504 {
    private final Productionnull_21504 production = new Productionnull_21504("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}