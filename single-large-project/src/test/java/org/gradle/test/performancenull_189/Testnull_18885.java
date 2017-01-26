package org.gradle.test.performancenull_189;

import static org.junit.Assert.*;

public class Testnull_18885 {
    private final Productionnull_18885 production = new Productionnull_18885("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}