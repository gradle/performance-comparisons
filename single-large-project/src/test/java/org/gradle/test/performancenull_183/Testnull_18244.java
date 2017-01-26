package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18244 {
    private final Productionnull_18244 production = new Productionnull_18244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}