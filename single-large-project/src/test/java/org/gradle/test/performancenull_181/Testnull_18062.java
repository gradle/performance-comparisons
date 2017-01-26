package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18062 {
    private final Productionnull_18062 production = new Productionnull_18062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}