package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21883 {
    private final Productionnull_21883 production = new Productionnull_21883("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}