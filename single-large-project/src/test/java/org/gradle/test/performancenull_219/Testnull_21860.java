package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21860 {
    private final Productionnull_21860 production = new Productionnull_21860("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}