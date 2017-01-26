package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21948 {
    private final Productionnull_21948 production = new Productionnull_21948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}