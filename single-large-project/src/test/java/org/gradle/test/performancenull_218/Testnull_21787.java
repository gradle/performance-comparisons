package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21787 {
    private final Productionnull_21787 production = new Productionnull_21787("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}