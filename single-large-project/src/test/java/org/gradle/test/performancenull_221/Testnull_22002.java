package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22002 {
    private final Productionnull_22002 production = new Productionnull_22002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}