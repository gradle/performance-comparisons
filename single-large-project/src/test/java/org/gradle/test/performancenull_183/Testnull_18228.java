package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18228 {
    private final Productionnull_18228 production = new Productionnull_18228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}