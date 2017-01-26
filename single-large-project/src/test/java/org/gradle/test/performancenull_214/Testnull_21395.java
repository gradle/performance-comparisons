package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21395 {
    private final Productionnull_21395 production = new Productionnull_21395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}