package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18210 {
    private final Productionnull_18210 production = new Productionnull_18210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}