package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21871 {
    private final Productionnull_21871 production = new Productionnull_21871("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}