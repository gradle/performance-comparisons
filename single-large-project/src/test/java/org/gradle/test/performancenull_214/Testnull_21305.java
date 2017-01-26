package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21305 {
    private final Productionnull_21305 production = new Productionnull_21305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}