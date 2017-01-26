package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18084 {
    private final Productionnull_18084 production = new Productionnull_18084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}