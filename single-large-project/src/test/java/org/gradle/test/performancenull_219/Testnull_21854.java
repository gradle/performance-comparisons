package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21854 {
    private final Productionnull_21854 production = new Productionnull_21854("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}