package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4948 {
    private final Productionnull_4948 production = new Productionnull_4948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}